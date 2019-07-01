package com.stackroute.pe2;

public class Factorial
{
    public String factInt(int x)
    {
        if(x>=13)
        {
            return "out of range";
        }

        int product=1;
        for(int i=1;i<=x;i++)
        {
            product*=i;
        }

        return Integer.toString(product);
    }

    public String factLong(Long x)
    {
        if(x>=21)
        {
            return "out of range";
        }

        Long product=1L;
        for(Long i=1L;i<=x;i++)
        {
            product=product*i;
        }

        return Float.toString(product);
    }



}
