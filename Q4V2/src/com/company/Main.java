package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        final long Starttime = System.currentTimeMillis();
        String testString = "1*011*";
        Print2File("String Test: " + testString);
        RevealStr(testString);
        final long Endtime = System.currentTimeMillis();
        Print2File("Finish Time: " + (Endtime - Starttime) + "ms.");
    }


    //recursive function
    public static void RevealStr(String s)
    {

        int num_stars = 0;
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] == '*')
            {
                num_stars++;
            }
        }

        int[] indices = new int[num_stars];
        for(int i = 0, j = 0; i < str.length; i++)
        {
            if(str[i] == '*')
            {
                indices[j++] = i;
            }
        }

        int numIterations = (int) Math.pow(2,num_stars);
        int binaryNumber = numIterations;
        int index;
        String binString;
        for(int i = 0; i < numIterations; i++)
        {
            binString = Integer.toBinaryString(binaryNumber); //log(n) allocation
            for(int j = 0; j < num_stars; j++)
            {
                index = indices[j];
                str[index] = binString.charAt(j + 1);
            }
            binaryNumber++;
            Print2File(String.valueOf(str));
        }
    }

    public static void Print2File(String str)
    {
        String fileName = "out.txt";
        try
        {
            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            out.write(str +'\n');
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("exception occoured" + e);
        }
    }
}
