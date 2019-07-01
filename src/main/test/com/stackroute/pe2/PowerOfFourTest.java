package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour ob;

    @Before
    public void setUp() throws Exception {
        ob=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenANumberChecksIfItsAPowerOfFour()
    {
        boolean result=ob.powerFour(5);
        assertEquals(false,result);
    }

    @Test
    public void givenAPowerOfNumChecksItsValidity()
    {
        boolean result=ob.powerFour(64);
        assertEquals(true,result);
    }

    @Test
    public void givenANegativeChecksItsValidity()
    {
        boolean result=ob.powerFour(-64);
        assertEquals(false,result);
    }

}