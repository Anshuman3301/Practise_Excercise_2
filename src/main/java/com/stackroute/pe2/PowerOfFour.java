package com.stackroute.pe2;

public class PowerOfFour
{
    public boolean powerFour(int number)
    {
        if(number<=0)
        {
            return false;
        }
        int mul=1;
        while(mul<number)
        {
            mul=mul<<2;
        }

        if(mul==number)
        {
            return true;
        }

        return false;
    }
}
