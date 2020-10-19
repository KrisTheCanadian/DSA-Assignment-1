package com.company;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final long Starttime = System.currentTimeMillis();
        String testString = "1011*00*10";
        Print2File("String Test: " + testString);
	    RevealStr(testString, 0);
        final long Endtime = System.currentTimeMillis();
	    Print2File("Finish Time: " + (Endtime - Starttime) + "ms.");
    }


    //recursive function
    public static void RevealStr(String s, int i){
        //base case
        if(i == s.length()){
            Print2File(s);
            return;
        }
        //permute if *
        else if(s.charAt(i) == '*'){
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(i, '1');
            RevealStr(sb.toString(), i+1);
            sb.setCharAt(i, '0');
            RevealStr(sb.toString(), i+1);
            return;
        }
        //move along the string
        RevealStr(s, i+1);
    }

    public static void Print2File(String str)
    {
        String fileName = "out.txt";
        try {

            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            out.write(str +'\n');
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}
