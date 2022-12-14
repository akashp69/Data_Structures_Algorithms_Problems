package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    /**
     *This is Main method for checking word is anagram or not
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First String Here: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second String Here: ");
        String s2 = scanner.nextLine();
        if (checkAnagram(s1, s2))
            System.out.println(s1 + " and " + s2 + " strings are Anagrams");
        else
            System.out.println(s1 + " and " + s2 + " strings are NOT Anagrams");
        scanner.close();
    }

    /**
     *This is static method is used for check two strings are equal or not
     */
    public static boolean checkAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if (s1.length() != s2.length())
            return false;
        else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return (Arrays.equals(arr1, arr2));
        }
    }
}
