package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AvgMaxMinTest {

    AvgMaxMin ob;
    @Before
    public void setUp() throws Exception {
        ob=new AvgMaxMin();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenAnArrayOfIntegersShouldReturnAverage()
    {
        int[] arr={12,13,14,15};
        double res=ob.average(arr);
        assertEquals(13.5,res,0.0);
    }

    @Test
    public void givenAnArrayOfIntegersShouldReturnMin()
    {
        int[] arr={12,13,14,15};
        int res=ob.minimum(arr);
        assertEquals(12,res,0.0);
    }

    @Test
    public void givenAnArrayOfIntegersShouldReturnMax()
    {
        int[] arr={12,13,14,15};
        int res=ob.maximum(arr);
        assertEquals(15,res,0.0);
    }


}