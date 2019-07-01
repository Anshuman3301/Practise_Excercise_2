package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberClassTest
{
    MemberClass ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new MemberClass("Harry",20,10);
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
    public void shouldReturnAge()
    {
        assertEquals("age: 20", ob.age());
    }

    @Test
    public void shouldReturnSalary()
    {
        assertEquals("salary: 10.0", ob.salary());
    }

}