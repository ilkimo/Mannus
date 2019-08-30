/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mannus;

import mannus.core.MyCalendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kimo
 */
public class MyCalendarTest {
    
    public MyCalendarTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCalendar method, of class MyCalendar.
     */
    @Test
    public void testGetCalendar() throws Exception {
        System.out.println("getCalendar");
        String date = "";
        MyCalendar expResult = null;
        MyCalendar result = MyCalendar.getCalendar(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYEAR method, of class MyCalendar.
     */
    @Test
    public void testGetYEAR() {
        System.out.println("getYEAR");
        MyCalendar instance = null;
        int expResult = 0;
        int result = instance.getYEAR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMONTH method, of class MyCalendar.
     */
    @Test
    public void testGetMONTH() {
        System.out.println("getMONTH");
        MyCalendar instance = null;
        int expResult = 0;
        int result = instance.getMONTH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_DAY_OF_MONTH method, of class MyCalendar.
     */
    @Test
    public void testGet_DAY_OF_MONTH() {
        System.out.println("get_DAY_OF_MONTH");
        MyCalendar instance = null;
        int expResult = 0;
        int result = instance.get_DAY_OF_MONTH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_DAY_OF_WEEK method, of class MyCalendar.
     */
    @Test
    public void testGet_DAY_OF_WEEK() {
        System.out.println("get_DAY_OF_WEEK");
        MyCalendar instance = null;
        String expResult = "";
        String result = instance.get_DAY_OF_WEEK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_last_day_of_week method, of class MyCalendar.
     */
    @Test
    public void testGet_last_day_of_week() throws Exception {
        System.out.println("get_last_day_of_week");
        MyCalendar instance = null;
        MyCalendar expResult = null;
        MyCalendar result = instance.get_last_day_of_week();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goToFirstMonday method, of class MyCalendar.
     */
    @Test
    public void testGoToFirstMonday() {
        System.out.println("goToFirstMonday");
        MyCalendar instance = null;
        instance.goToFirstMonday();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeeksOfOperatingYear method, of class MyCalendar.
     */
    @Test
    public void testGetWeeksOfOperatingYear_String() {
        System.out.println("getWeeksOfOperatingYear");
        String year = "";
        String[] expResult = null;
        String[] result = MyCalendar.getWeeksOfOperatingYear(year);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeeksOfOperatingYear method, of class MyCalendar.
     */
    @Test
    public void testGetWeeksOfOperatingYear_3args() {
        System.out.println("getWeeksOfOperatingYear");
        String year = "";
        int FIRST_WORKING_MONTH = 0;
        int LAST_WORKING_MONTH = 0;
        String[] expResult = null;
        String[] result = MyCalendar.getWeeksOfOperatingYear(year, FIRST_WORKING_MONTH, LAST_WORKING_MONTH);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstWorkingMonday method, of class MyCalendar.
     */
    @Test
    public void testGetFirstWorkingMonday() {
        System.out.println("getFirstWorkingMonday");
        String year = "";
        String month = "";
        MyCalendar expResult = null;
        MyCalendar result = MyCalendar.getFirstWorkingMonday(year, month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstDayOfMonth method, of class MyCalendar.
     */
    @Test
    public void testGetFirstDayOfMonth() {
        System.out.println("getFirstDayOfMonth");
        String year = "";
        String month = "";
        MyCalendar expResult = null;
        MyCalendar result = MyCalendar.getFirstDayOfMonth(year, month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of change_FIRST_OPERATIVE_MONTH method, of class MyCalendar.
     */
    @Test
    public void testChange_FIRST_OPERATIVE_MONTH() throws Exception {
        System.out.println("change_FIRST_OPERATIVE_MONTH");
        int monthNumber = 0;
        MyCalendar.change_FIRST_OPERATIVE_MONTH(monthNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of change_LAST_OPERATIVE_MONTH method, of class MyCalendar.
     */
    @Test
    public void testChange_LAST_OPERATIVE_MONTH() throws Exception {
        System.out.println("change_LAST_OPERATIVE_MONTH");
        int monthNumber = 0;
        MyCalendar.change_LAST_OPERATIVE_MONTH(monthNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_FIRST_OPERATIVE_MONTH method, of class MyCalendar.
     */
    @Test
    public void testGet_FIRST_OPERATIVE_MONTH() {
        System.out.println("get_FIRST_OPERATIVE_MONTH");
        int expResult = 0;
        int result = MyCalendar.get_FIRST_OPERATIVE_MONTH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_LAST_OPERATIVE_MONTH method, of class MyCalendar.
     */
    @Test
    public void testGet_LAST_OPERATIVE_MONTH() {
        System.out.println("get_LAST_OPERATIVE_MONTH");
        int expResult = 0;
        int result = MyCalendar.get_LAST_OPERATIVE_MONTH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_FIRST_OPERATIVE_MONTH method, of class MyCalendar.
     */
    @Test
    public void testSet_FIRST_OPERATIVE_MONTH() {
        System.out.println("set_FIRST_OPERATIVE_MONTH");
        int newMonthValue = 0;
        MyCalendar.set_FIRST_OPERATIVE_MONTH(newMonthValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_LAST_OPERATIVE_MONTH method, of class MyCalendar.
     */
    @Test
    public void testSet_LAST_OPERATIVE_MONTH() {
        System.out.println("set_LAST_OPERATIVE_MONTH");
        int newMonthValue = 0;
        MyCalendar.set_LAST_OPERATIVE_MONTH(newMonthValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MyCalendar.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MyCalendar instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
