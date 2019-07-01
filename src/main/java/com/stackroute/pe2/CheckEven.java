package com.stackroute.pe2;

public class CheckEven
{
    public boolean checkEven(int number)
    {
        if(number<0)
        {
            return false;
        }

        if(number%2==0)
        {
            return true;
        }

        return false;
    }
}
