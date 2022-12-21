package com.bridgelabz;

import java.util.Arrays;

public class TwoStringsAreEquals {
    /**
     *This is main method used for check two strings are equal or not by using equals method
     */
    public static void main(String[] args) {
            String[] s1 = { "Akash" };
            String[] s2 = { "akash" };

            if (Arrays.equals(s1, s2)) {
                System.out.println("Both arrays are equal");
            }
            else {
                System.out.println("Both arrays are not equal");
            }

        }

    }

