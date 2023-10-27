package com.anand;

import java.util.Scanner;

public class RecursiveFunction {

    // recursive function to find reverse
    static String rev(String s) {
        // Base case: if the string is empty or has a length of 1, return it as is S.
        if (s.length() == 1)
            return s;
        else
            // Recursive call
            return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.nextLine();

        System.out.println("REVERSE: " + rev(str));
    }
}

