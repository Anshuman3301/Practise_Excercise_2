package com.stackroute.pe2;

public class ReverseString
{
    public boolean reverseString(String input)
    {


        if(input.equals(""))
        {
            return true;
        }
        String rev="";
        for(int i=0;i>=0;i--)
        {
            rev+=input.charAt(i);
        }

        if(rev.equals(input))
        {
            return true;
        }

        return false;
    }
}
