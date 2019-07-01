package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenTest {

    CheckEven ob;
    @Before
    public void setUp() throws Exception {
        ob=new CheckEven();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenAnOddNumberShouldReturnFalse()
    {
        boolean res=ob.checkEven(5);
        assertEquals(false,res);
    }

    @Test
    public void givenAnEvenNumberShouldReturnTrue()
    {
        boolean res=ob.checkEven(6);
        assertEquals(true, res);
    }
}