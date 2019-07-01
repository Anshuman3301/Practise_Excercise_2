package com.stackroute.pe2;

public class AvgMaxMin
{
    public double average(int[] arr)
    {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }

        return sum/arr.length;
    }

    public int maximum(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

        return max;
    }

    public int minimum(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

        return min;
    }
}
