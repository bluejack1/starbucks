


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProxyPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProxyPatternTest
{
    IApp app ;
    
    /**
     * Default constructor for test class ProxyPatternTest
     */
    public ProxyPatternTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        app = new AppAuthProxy() ;
    }


    @Test
    public void testSuccess()
    {
        // Test Successful Pin:  
        // (enter correct pin digits)
        app.touch(1,5);
        app.touch(2,5);
        app.touch(3,5);
        app.touch(4,5);



        // Validate Pin Succeeded 
        // (replace with correct assert)
        assertEquals( app.screen(),"MyCards" ); ;
    }

    @Test
    public void testFailed()
    {
        // Test Failed Pin:  
        // (enter incorrect pin digits)

        // Validate Pin Succeeded 
        // (replace with correct assert)
       // assertTrue( false ) ;

        // Test Successful Pin:
        // (enter correct pin digits)
        app.touch(1,5);
        app.touch(2,5);
        app.touch(3,5);
        app.touch(3,5);



        // Validate Pin Succeeded
        // (replace with correct assert)
        assertEquals( app.screen(),"PinScreen" ); ;
    }

    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
