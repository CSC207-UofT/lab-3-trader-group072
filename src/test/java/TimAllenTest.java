/* Test the implementations of Domesticatable and Tradable on TimAllen */

import org.junit.*;

import static org.junit.Assert.*;


public class TimAllenTest {
    TimAllen t;

    @Before
    public void setUp() throws Exception {
        t = new TimAllen();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("AEUUUGH???", t.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(3, t.getPrice());
    }

}
