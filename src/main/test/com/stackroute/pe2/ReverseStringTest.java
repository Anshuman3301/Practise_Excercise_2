package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest
{
    ReverseString ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new ReverseString();
    }

    @After
    public void teardown()
    {
        System.out.println("After");
        ob=null;
    }

    @BeforeClass
    public static void setupBeforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void teardownAfterClass()
    {
        System.out.println("After Class");
    }

    @Test
    public void givenAStringShouldCheckPallindrome()
    {
        boolean result=ob.reverseString("Agha");
        assertEquals(false, result);
    }


    @Test
    public void givenAnEmptyStringShouldReturnTrue()
    {
        boolean result=ob.reverseString("");
        assertEquals(true, result);
    }
}