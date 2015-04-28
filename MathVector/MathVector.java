// Author: 		Justino Mora
// Date: 		April, 2015
// Project: 	MathVector
// Description: MathVector is a class for N-dimensional mathematical (Euclidean) vectors.
//				Read README file for more details. 

package MathVector; 

public class MathVector {
    // Represents the dimension of the vector: 
    private int m_dimension;  
    
    // Holds the Cartesian components of the vector: 
    private double[] cartesianComp; 
    
    public void setDimension(int dimension)
    {
        if(dimension > 0)
        {
            m_dimension = dimension; 
        }
        else 
        {
            System.out.println("Dimension must be 1 or greater."
            + "Dimension has been set to 1");
            m_dimension = 1; 
        }
    }
    
    public int getDimension()
    {
        return m_dimension; 
    }
    
    /******************* CONSTRUCTORS ********************/ 
    public MathVector(int dimension)
    {
        setDimension(dimension); 
        
        // allocate memory for the vector with the provided dimension
        cartesianComp = new double[this.m_dimension];

        //initialize each index to zero
        for(int i = 0; i < this.m_dimension; i++){
            this.cartesianComp[i] = 0; 
        }
    }
    
    public MathVector(int[] cartesianComponents)
    {
        int vectorLength = cartesianComponents.length; 
        setDimension(vectorLength); 
        
        // allocate memory for the vector with the provided dimension
        cartesianComp = new double[m_dimension];

        //initialize each index in the vector with the cartesianComponents
        for(int i = 0; i < m_dimension; i++){
            cartesianComp[i] = cartesianComponents[i]; 
        }
    }
   
    // Returns the i-th Cartesian component of the vector
    public double getEl(int index)
    {
        double ithComponent = 0; 
        if( index >= 0)
        {
            return cartesianComp[index]; 
        } 
        else 
        {
            System.out.println("You must provide value of zero or greater "
            + " (returned a value of -1 instead)."); 
            return -1; 
        }
    }
    
    // Returns the negative of the original vector
    public MathVector neg(){
        for(int i = 0; i < m_dimension; i++)
        {
            cartesianComp[i] *= -1; 
        }
        return this; 
    }
    
    // Returns the magnitude of the vector
    public double mag()
    {
        double sum = 0; 
        double magnitude = 0; 
        
        for(int i = 0; i < m_dimension; i++)
        {
            sum += cartesianComp[i]*cartesianComp[i];
        }
        magnitude = Math.sqrt(sum); 
        return magnitude; 
    }
    
    // Returns the dot product of the vector and another vector
    public double dot(MathVector v1)
    {
        double sum = 0; 
        // Check that both vectors are of the same size, if not 
        // return -1
        if (m_dimension != v1.m_dimension)
        {
            System.out.println("Vectors must match in length in order to " 
            + "perform the dot product (returned -1 instead).");
            return -1; 
        }
        for(int i = 0; i < m_dimension; i++)
        {
            // dot product
            sum += cartesianComp[i] * v1.cartesianComp[i]; 
        }
        return sum; 
    }
    
    // Returns the sum of the vector and another vector
    public MathVector plus(MathVector v1)
    {       
        // Check that both vectors are of the same size, if not 
        // return -1
        if (m_dimension != v1.m_dimension)
        {
            System.out.println("Vectors must match in length in order to " 
            + "perform addition (returned empty vector with " 
            + " 1 dimension).");
            MathVector emptyVector = new MathVector(1); 
            return emptyVector; // 
        }
        MathVector result = new MathVector(m_dimension); 
        
        for(int i = 0; i < m_dimension; i++)
        {
            result.cartesianComp[i] = cartesianComp[i] + v1.cartesianComp[i]; 
        }
        return result; 
    }
    
    // Returns the product of the vector and a scalar (“scalar product”)
    public MathVector sp(int scalar)
    {
        MathVector result = new MathVector(m_dimension); 
        
        for(int i = 0; i < m_dimension; i++)
        {
            result.cartesianComp[i] = cartesianComp[i] * scalar; 
        }
        return result;  
    }
    
    // Prints the elements of the vector, like “[1, 0, 0]”
    public void printMe()
    {
        System.out.print("[");
        for(int i = 0; i < m_dimension; i++)
        {
            if( i == m_dimension-1 ){
            // if last element in the array, print closing bracket
                System.out.println(cartesianComp[i] + "]"); 
            }
            else {
                System.out.print(cartesianComp[i] + ", "); 
            }
        }
    }
}