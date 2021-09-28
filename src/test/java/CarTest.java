/*
 * Tests for Car class
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CarTest {
    Car theRedOne;

    @Before
    public void setUp() throws Exception {
        theRedOne = new Car();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Beep! Beep!", theRedOne.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(500, theRedOne.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        theRedOne.upgradeSpeed();
        assertEquals(510, theRedOne.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        theRedOne.downgradeSpeed();
        assertEquals(490, theRedOne.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(36018, theRedOne.getPrice());
    }

}

