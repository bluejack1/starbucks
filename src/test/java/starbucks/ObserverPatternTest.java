package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{
    KeyPad keypad = null;
    PinEntryMachine pinEntryMachine = null;
    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
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
        // Set up Key Pad and Pin Entry Machine
        keypad = new KeyPad();
        pinEntryMachine = new PinEntryMachine();
        keypad.attach(pinEntryMachine);
        // Using Observer Pattern  
    }


    @Test
    public void testOneKey()
    {
        // Key Pad Press 1
        keypad.touch(1,5);

        // Assert D1 is "1" (replace with appropriate test)
        //assertTrue( false ) ;
        assertTrue(pinEntryMachine.d1().equals("1"));
    }

    @Test
    public void testTwoKeys()
    {
        // Key Pad Press 1 and 2
        keypad.touch(1,5);
        keypad.touch(2,5);
       
        // Assert D1 and D2 are correct 
        // (replace with appropriate test)
        //assertTrue( false ) ;
        assertTrue(pinEntryMachine.d1().equals("1"));
        assertTrue(pinEntryMachine.d2().equals("2"));
        //assertEquals(pinEntryMachine.d1(), "1");
        //assertEquals(pinEntryMachine.d2(), "2");
    }

    @Test
    public void testThreeKeys()
    {
        // Key Pad Press 1, 2 and 3

        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)
        //assertTrue( false ) ;

        keypad.touch(1,5);
        keypad.touch(2,5);
        keypad.touch(3,5);
        
        // Assert D1 is "1" (replace with appropriate test)
        //assertTrue( false ) ;
        assertTrue(pinEntryMachine.d1().equals("1"));
        assertTrue(pinEntryMachine.d2().equals("2"));
        assertTrue(pinEntryMachine.d3().equals("3"));
     }

    @Test
    public void testFourKeys()
    {
        // Key Pad Press 1, 2, 3 and 4

        // Assert D1, D2, D3 and D4 are correct
        // (replace with appropriate test)
        keypad.touch(1,5);
        keypad.touch(2,5);
        keypad.touch(3,5);
        keypad.touch(1,6);
        
        // Assert D1 is "1" (replace with appropriate test)
        //assertTrue( false ) ;
        assertTrue(pinEntryMachine.d1().equals("1"));
        assertTrue(pinEntryMachine.d2().equals("2"));
        assertTrue(pinEntryMachine.d3().equals("3"));
        assertTrue(pinEntryMachine.d4().equals("4"));
    }

   @Test
    public void testBackspace()
    {
        // Key Pad Press 1, 2, 3 and 4

        // Assert D1, D2, D3, D4 are correct
        // (replace with appropriate test)
        //assertTrue( false ) ;

        keypad.touch(1,5);
        keypad.touch(2,5);
        keypad.touch(3,5);
        keypad.touch(1,6);
        
        // Assert D1 is "1" (replace with appropriate test)
        //assertTrue( false ) ;
        assertTrue(pinEntryMachine.d1().equals("1"));
        assertTrue(pinEntryMachine.d2().equals("2"));
        assertTrue(pinEntryMachine.d3().equals("3"));
        assertTrue(pinEntryMachine.d4().equals("4"));



        // Key Pad Press 1, 2, 3 and 4 and then backspace
        keypad.touch(3,8);

        assertTrue(pinEntryMachine.d1().equals("1"));
        assertTrue(pinEntryMachine.d2().equals("2"));
        assertTrue(pinEntryMachine.d3().equals("3"));
        assertFalse(pinEntryMachine.d4().equals("4"));

        // Assert D1, D2, D3, D4 are correct
        // (replace with appropriate test)
        //assertTrue( false ) ;        

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