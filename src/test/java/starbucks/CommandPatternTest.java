


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommandPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommandPatternTest
{
    IApp app ;
    KeyPad kp ;
    
    /**
     * Default constructor for test class CommandPatternTest
     */
    public CommandPatternTest()
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
    public void testMyCards()
    {
        // Login with pin
    	
    	    app.touch(1,5) ;
		app.touch(2,5) ;
		app.touch(3,5) ;
		app.touch(1,6) ;
		
		app.execute("A");
	
        // Select Menu "A"
 
        // Assertion
        assertEquals("MyCards", app.screen());            
    }

    @Test
    public void testPayments()
    {
        // Login with pin

        // Select Menu "B"
    	
    	app.touch(1,5) ;
		app.touch(2,5) ;
		app.touch(3,5) ;
		app.touch(1,6) ;
		
		app.execute("B");
 
        // Assertion
        assertEquals("Payments", app.screen());            
    }

  @Test
    public void testRewards()
    {
        assertEquals("PinScreen", app.screen());
        // Login with pin

        // Select Menu "C"
        
        app.touch(1,5) ;
		app.touch(2,5) ;
		app.touch(3,5) ;
		app.touch(1,6) ;
		
		app.execute("C");
 
        // Assertion 
        assertEquals("Rewards", app.screen());            
    }

  @Test
    public void testStore()
    {
        // Login with pin

        // Select Menu "D"
	  
	  app.touch(1,5) ;
		app.touch(2,5) ;
		app.touch(3,5) ;
		app.touch(1,6) ;
		
		app.execute("D");
 
        // Assertion 
        assertEquals("Store", app.screen());            
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
