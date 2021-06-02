package org.practice.character_array;

public class CharacterArray {

    public static void main(String[] args) {
        String[] strings = {"camelCase", "caMelCase", "camelCaSe", "camelCasE", "cAmelCase", "cameLCase", "camelCaSE"};
        String string = "  154wordBDSAB7  worddsa_32_fdkhas      fdhafword  word   14word15  ";

//        removeUnnecessaryBackspaces(string);
//        countNumbers(string);
//        countDigits(string);
//        replaceWordByLetter(string);
        convertToSnakeCase(strings);
    }

    public static void convertToSnakeCase(String[] strings) {
        for (String string : strings) {
            System.out.println();
            char[] array = string.toCharArray();

            for (char ch : array) {
                if (Character.isUpperCase(ch)) {
                    System.out.print("_" + Character.toLowerCase(ch));
                } else {
                    System.out.print(ch);
                }
            }
        }
    }

    public static void replaceWordByLetter(String string) {
        System.out.println(string.replace("word", "letter"));
    }

    public static void countDigits(String string) {
        int counter = 0;
        char[] array = string.toCharArray();

        for (char ch : array) {
            if (Character.isDigit(ch)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void countNumbers(String string) {
        int counter = 0;
        boolean bool = false;
        char[] array = string.toCharArray();
        int length = array.length;

        for (int i = 0; i < length; i++) {
            char ch = array[i];

            if (Character.isDigit(ch)) {
                bool = true;
            }
            if (bool && (!Character.isDigit(ch) || i == length - 1)) {
                counter++;
                bool = false;
            }
        }
        System.out.println("Counter Numbers = " + counter);
    }

    public static void removeUnnecessaryBackspaces(String str) {
        String string = str.trim();
        char[] array = string.toCharArray();
        int length = string.length();

        for (int i = 1; i < length; i++){
            if (!Character.isWhitespace(array[i])) {
                System.out.print(array[i]);
            } else if (Character.isWhitespace(array[i]) && !Character.isWhitespace(array[i - 1]))
                System.out.print(array[i]);
        }
    }
}
