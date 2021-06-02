package org.practice.object_type_string;

import java.util.Scanner;

public class StringType {
    public static void main(String[] args) {
        String string = "n 1doi  2fdo   3nf            12ndasfiafian     5sandiadina                                32 ";
        countMaxWhitespaces(string);

//        String string = "adsdsfjn aajnfdfnlsa";
//        insertAfterB(string);

//        String string = "tenet";
//        System.out.println(isPalindrome(string));

//        String string = "информатика";
//        makeUpWord(string);

//        String string = "ahdsahdvacasacas sdasiaaicb   a10";
//        countChar(string);

//        String string = "asdcas";
//        duplicateLetters(string);

//        String string = "abc cde def";
//        removeRepeats(string);

//        findMaxLengthWord();

//        countUpperAndLowerCaseToLine();

//        String string = "asgfdaf? gggg. guijkguaodg! jafbdgvkvbkajbdvjvab: kldsfh; k kk sac bnxx, jbaskja. abasskdbj?";
//        countSentences(string);
    }

    public static void countMaxWhitespaces(String string) {
        final char space = ' ';
        int length = string.length();
        int max = 0;
        int temp = 0;

        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == space) {
                temp++;
                if (max < temp) {
                    max = temp;
                }
            } else {
                temp = 0;
            }
        }
        System.out.println(max);
    }

    public static void insertAfterB(String string) {
        final char a = 'a';
        final char b = 'b';
        StringBuilder builder = new StringBuilder(string);

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == a) {
                builder.insert(i + 1, b);
                i++;
            }
        }
        System.out.println(builder);
    }

    public static boolean isPalindrome(String string) {
        StringBuilder builder = new StringBuilder(string).reverse();

        return string.equalsIgnoreCase(builder.toString());
    }

    public static void makeUpWord(String string) {
        final char t = 'т';
        final char o = 'о';
        final char r = 'р';
//        StringBuilder result = new StringBuilder();
//        result.append(string.charAt(string.indexOf(t)));
//        result.append(string.charAt(string.indexOf(o)));
//        result.append(string.charAt(string.indexOf(r)));
//        result.append(string.charAt(string.indexOf(t)));


        String result = String.valueOf(string.charAt(string.indexOf(t))) +
                string.charAt(string.indexOf(o)) +
                string.charAt(string.indexOf(r)) +
                string.charAt(string.indexOf(t));
        System.out.println(result);
    }

    public static void countChar(String string) {
        final char a = 'a';
        int length = string.length();
        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == a) {
                counter++;
            }
        }
        System.out.println("Number of letter A in line = " + counter);
    }

    public static void duplicateLetters(String string) {
        StringBuilder duplicate = new StringBuilder(string);

        for (int i = 0; i < duplicate.length(); i += 2) {
            char ch = duplicate.charAt(i);
            duplicate.insert(i, ch);
        }
        System.out.println(duplicate);
    }

    public static void removeRepeats(String string) {
        final char whitespace = ' ';
        StringBuilder result = new StringBuilder(string);

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            for (int j = i + 1; j < result.length(); j++) {
                if (result.charAt(j) == ch || result.charAt(j) == whitespace) {
                    result.deleteCharAt(j);
                }
            }
        }
        System.out.println(result);
    }

    public static void findMaxLengthWord() {
        int max = 0;
        int indexMax = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter words separated by spaces ");
            String string = scanner.nextLine();
            String[] strings = string.split(" ");

            for (int i = 0; i < strings.length; i++) {
                int length = strings[i].length();
                if (max < length) {
                    max = length;
                    indexMax = i;
                }
            }
            System.out.println("Longest word = " + strings[indexMax]);
        }
    }

    public static void countUpperAndLowerCaseToLine() {
        int upper = 0;
        int lower = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String string = scanner.nextLine();

            for (int i = 0; i < string.length(); i++) {
                if (Character.isUpperCase(string.charAt(i))) {
                    upper++;
                }
                if (Character.isLowerCase(string.charAt(i))) {
                    lower++;
                }
            }
        }
        System.out.println("Lower case letters = " + lower);
        System.out.println("Upper case letters = " + upper);
    }

    public static void countSentences(String string) {
        final char a = '.';
        final char b = '!';
        final char c = '?';
        int counter = 0;
        int length = string.length();

        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            if (ch == a || ch == b || ch == c) {
                counter++;
            }
        }
        System.out.println("Number of sentences in a given text = " + counter);
    }
}
