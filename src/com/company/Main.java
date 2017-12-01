package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[] skaiciai = {100, 832, 1456, 2, 854};
       Arrays.sort(skaiciai);
       Max(skaiciai);
    }

    public static int Max(int[] skaiciai) {

        int max = skaiciai[skaiciai.length - 1];
        System.out.println(max);
        return max;

    }


}

