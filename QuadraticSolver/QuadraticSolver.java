/* Author: 			Justino Mora
 * Project Name: 	Quadratic Solver
 * Description: 	This simple Java program solves a quadratic equation using
 *					Newton's method (Newton-Raphson Method), an iterative procedure
 *					for finding a root (zero) of a function. 
 *					Functionality: 
 * 						- finds one of the roots of your equation starting from
 * 							your initial guess (must be hard-coded). 
 * 						- for a better approximation to the actual root, adjust 
 * 							the tolerance variable (larger number: more accurate)
*/ 



public class QuadraticSolver {
	/**
     * args the command line arguments
     */

	public static void main(String[] args)
	{
		// Recall that Quadratic Equations are of the form: 
		// f(x) = a(x^2) + b(x) + c
        
        double a, b, c; // all initialized to zero 

        // NOTE: in this program: 
        //  f(x) is represented by       f 
        // f'(x) is represented by      dfdx 
        //   dx  is represented by   -( f/dfdx )

        double x, f, dfdx, dx; // all initialized to zero 

        f = 0; // assign zero: prevents compilation error 

        // Let's consider the quadratic function: 
        //      f(x) = 2(x^2) - 11(x) + 5 ; then 
        //     f'(x) = 4(x) - 11
        // Thus: 
        a = 2; 
        b = -11;  
        c = 5;   
        
         // My Guess of what one of the roots is 6
        x = 6; 

        // Let's consider a tolerance of: 
        int tolerance = 3; // 0.001
        
        for(int i = 0; i < tolerance; i++)
        {
            // Calculate f
            f = 2*(x*x) - (11*x) + 5; 
            
            // Calculate dfdx 
            dfdx = 4*x - 11; 
            
            // Calculate  dx 
            dx = -1*(f/dfdx); 
            
            // New x 
            x += dx; 
            
            System.out.println("x = " + x + ", f = " + f + ", "
             + "dfdx = " + dfdx + ", dx = " + dx); 
        }
        
        System.out.println("Converged!");
        System.out.println("x = " + x + ", f = " + f); 
	}
}