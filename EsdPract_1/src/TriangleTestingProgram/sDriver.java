
// 20 July 2020 
// (c) Chris Simons

// "Write a program that accepts three integers representing the lengths of a triangle,
//  and determines the type of triangle formed by the three lengths."
//  Taken from "The Art of Software Testing", By Glen Myers et al. 

//  Implement the program in two java classes: Driver.java, which holds the main() function, 
//  and Triangle.java, which holds the representation of a triangle. 

//  Implement the program such that input of the three integers comes from the command line,
//  and the result is output as text via System.out.println( ).  


// TODO - robust validation of three integers input via the command line


package TriangleTestingProgram;

public class sDriver
{
    public static void main( String [ ] args )
    {
        int sideOne = Integer.parseInt( args[ 0 ] );
        int sideTwo = Integer.parseInt( args[ 1 ] );
        int sideThree = Integer.parseInt( args[ 2 ] );
		
	sTriangle triangle = new sTriangle( sideOne, sideTwo, sideThree );
	System.out.println( "Your triangle is: " + triangle.evaluate( ) );
    }
}

// end of file