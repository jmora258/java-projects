// Author: 		Justino Mora
// Date: 		April, 2015
// Project: 	MathVector
// Description: MathVector is a class for N-dimensional mathematical (Euclidean) vectors.
//				Read README file for more details. 

// package MathVector; 


public class MathVectorTester {

	public static void main(String[] args)
	{
		System.out.println("hello world!"); 
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
