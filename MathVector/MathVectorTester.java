// Author: 		Justino Mora
// Date: 		April, 2015
// Project: 	MathVector
// Description: MathVector is a class for N-dimensional mathematical (Euclidean) vectors.
//				Read README file for more details. 

// package MathVector; 


public class MathVectorTester {

	public static void main(String[] args)
	{
		// Test Contructors and Print method: 
        System.out.println("Testing Constructors and print method:");
        int[] array1 = {8, 5, 4, 9, 1}; 
        System.out.print("v1 is the array ");
        printArray(array1);
        
        System.out.println("Create a new MathVector from cartesian components "
        + "in v1 and print: ");
        MathVector v1 = new MathVector(array1);
        v1.printMe(); 
        System.out.println(); // empty line
        
        System.out.println("Create a new MathVector with 5 elements "
        + "(unspecified): "); 
        MathVector v2 = new MathVector(5); 
        v2.printMe(); 
        System.out.println(); // empty line

        // Declare arrays to create corresponding MathVectors
        int[] aArray = {8, 5, 4, 9, 1};
        int[] bArray = {1, 1, 1, 1, 1}; 
        
        // Create MathVectors from the previously declared arrays: 
        MathVector a = new MathVector(aArray);
        MathVector b = new MathVector(bArray); 
        MathVector c; // not initialized, just a MathVector reference 
        
        System.out.print("MathVector a has elements: "); 
        printArray(aArray); 
        System.out.print("MathVector b has elements: "); 
        printArray(bArray); 
        System.out.println("MathVector c is not initialized "); 
        System.out.println(); // empty line
        
        System.out.println("Get first element of a "); 
        System.out.println(a.getEl(0)); 
        System.out.println(); // empty line
        
        System.out.println("Assign the negative of a to c "); 
        // Since vector c is zero, then add c and a, then assign negative:
        c = a.neg(); 
        c.printMe(); 
        System.out.println(); // empty line
        
        System.out.println("Take the magnitude of a "); 
        System.out.println(a.mag()); 
        System.out.println(); // empty line
        
        System.out.println("Take the dot product of a with itself "); 
        System.out.println(a.dot(a)); 
        System.out.println(); // empty line
        
        System.out.println("add a and b and store the result in c "); 
        a.neg(); // But first, return a to its orignal state: 
        c = a.plus(b); 
        c.printMe(); 
        System.out.println(); // empty line
        
        System.out.println("c is the scalar product of a and 3 "); 
        c = a.sp(3);
        c.printMe();
	}

	// Print the contents in the array 
    public static void printArray(int[] array)
    {
        System.out.print("{");
        for(int i = 0; i < array.length; i++){
            if( i == array.length-1 ){
            // if last element in the array, print closing curly brace
                System.out.println(array[i] + "}"); 
            }
            else {
                System.out.print(array[i] + ","); 
            }
        }
    }
}
