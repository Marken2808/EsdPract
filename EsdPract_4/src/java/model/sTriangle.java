// Triangle.java
// 13 July 2020
// (c) Chris Simons

package model;

import java.util.Arrays;

// no package specified for the moment

public class sTriangle
{
    private final int sides[ ];
	
    /**
     * constructor
     * @param sideOne as integer
     * @param sideTwo as integer 
     * @param sideThree as integer
     */
    public sTriangle( int sideOne, int sideTwo, int sideThree )
    {
        sides = new int[ 3 ];
	for( int i : sides ) sides[ i ] = 0;
		
	sides[ 0 ] = sideOne;
	sides[ 1 ] = sideTwo;
	sides[ 2 ] = sideThree;	
    }
	
    // evaluate method
    public String evaluate( )
    {
	String result = "not evaluated yet";
		
        if( valid( ) )
        {
            result = determineType( );
        }
        else
        {
            result = "invalid side lengths"; 
        }

        return result;
    }
	
    // valid method
    private boolean valid( )
    {
        boolean result = true;

        Arrays.sort( sides );

        /*
        for( int i = 0; i < sides.length; i++ )
        {
                System.out.println( sides[ i ] );
        }
        */

        // largest side can't be smaller than or equal to the other two combined
        if( ( sides[ 0 ] + sides[ 1 ] ) <= sides[ 2 ] )
        {
            result = false;
        }
        return result;
    }
	
    /**
     * determineType
     * @return type of triangle as string
     */
    private String determineType( )
    {
        String result = "";

        if( sides[ 0 ] == sides[ 1 ] && sides[ 0 ] == sides[ 2 ])
        {
            result = "equilateral";
        }
        else if( sides[ 0 ] == sides[ 1 ] || sides[ 0 ] == sides[ 2 ] || sides[ 1 ] == sides[ 2 ] )
        {
            result = "isosceles";
        } 
        else
        {	
            result = "scalene";
        }

        return result;
    }
}

// end of file