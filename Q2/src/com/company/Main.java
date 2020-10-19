package com.company;

public class Main {

    public static void main(String[] args) {
        int[] num = {42, 21, 10, 31, 7};

        int l1 = -1; // largest
        int i_l1 = -1;

        int l2 = -1; // 2nd largest
        int i_l2 = -1;

        int s1 = Integer.MAX_VALUE; // smallest
        int i_s1 = -1;

        int s2 = Integer.MAX_VALUE; // second smallest
        int i_s2 = -1;

        int temp = 0;
        int i_temp = 0;

        //finding smallest 2 elements and their indices
        for(int i = 0; i < num.length; ++i){
            if(num[i] > l2)
            {
                if (num[i] > l1) {
                    temp = l1;
                    i_temp = i_l1;

                    l1 = num[i];
                    i_l1 = i;

                    l2 = temp;
                    i_l2 = i_temp;
                }
                else {
                    l2 = num[i];
                    i_l2 = i;
                }
            }
            //finding smallest 2 elements and their indices
            else if(num[i] < s2)
            {
                if(num[i] < s1){
                    temp = s1;
                    i_temp = i_s1;

                    s1 = num[i];
                    i_s1 = i;

                    s2 = temp;
                    i_s2 = i_temp;
                }
                else{
                    s2 = num[i];
                    i_s2 = i;
                }
            }
        }


        System.out.println("Largest Number: " + l1);
        System.out.println("Index " + i_l1);
        System.out.println("Second Largest Number: " + l2);
        System.out.println("Index: " + i_l2);
        System.out.println("Smallest Number: " + s1);
        System.out.println("Index " + i_s1);
        System.out.println("Second Smallest Number: " + s2);
        System.out.println("Index: " + i_s2);
    }
}
