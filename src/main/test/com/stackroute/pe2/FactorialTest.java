package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial ob;
    @Before
    public void setUp() throws Exception {
        ob=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenAnIntegerlessThan13returnsFactorial()
    {
        String res=ob.factInt(5);
        assertEquals("120",res);
    }

    @Test
    public void givenAnIntegerlessThan21returnsFactorial()
    {
        String res=ob.factLong(6L);
        assertEquals("720.0",res);
    }
}