/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3_weekdaycalculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ctralie
 */
public class HW3_WeekdayCalculatorTest {
    
    public HW3_WeekdayCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Tests of getCenturyAnchor method, of class HW3_WeekdayCalculator.
     */
    @Test
    public void testGetCenturyAnchor1900() {
        int century = 1900;
        int expResult = 3; // 1900 is a Wednesday
        int result = HW3_WeekdayCalculator.getCenturyAnchor(century);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetCenturyAnchor2000() {
        int century = 2000;
        int expResult = 2; // 2000 is a Tuesday
        int result = HW3_WeekdayCalculator.getCenturyAnchor(century);
        assertEquals(expResult, result);
    }

    /**
     * Tests of getDoomsdayYear method, of class HW3_WeekdayCalculator.
     */
    @Test
    public void testGetDoomsdayYear2020() {
        int year = 2020;
        int expResult = 6;
        int result = HW3_WeekdayCalculator.getDoomsdayYear(year);
        assertEquals(expResult, result);
    }
}
