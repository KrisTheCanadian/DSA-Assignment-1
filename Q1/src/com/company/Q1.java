package com.company;

public class Q1
{
    public static void main(String[] args)
    {
        int[] num = {51, 88, 3, 70, 96, 38, 47};
        int numOdds = 0;
        for (int val : num) {
            if (val % 2 == 1) { ++numOdds; }
        }
        int temp = 0;
        for(int i = 0; i < num.length - numOdds; ++i)
        {
            if(num[i] % 2 == 1)
            {
                temp = num[i];
                for(int j = i+1; j < num.length; ++j)
                {
                    num[j-1] = num[j];
                }
                num[num.length-1] = temp;
                i--; //to avoid stepping over an element
            }
        }
        for (int j : num) {
            System.out.println(j);
        }
    }
}
