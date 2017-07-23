package HelloWorld.HelloWorld;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
   
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

   
    public void testApp()
    {
    	
        assertEquals("Hello World", "Hello World");
    }
}
