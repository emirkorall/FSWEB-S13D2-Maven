package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        StringBuilder reversed = new StringBuilder();
        char[] chars = String.valueOf(number).toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);

        }
        return reversed.toString().equalsIgnoreCase(String.valueOf(number));
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;


    }


    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String[] chars = Integer.toString(number).split("");
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] wordsArray = new String[chars.length];

        for (int i = 0; i < chars.length; i++) {
            wordsArray[i] = words[Integer.parseInt(chars[i])];

        }
        return String.join(" ",wordsArray);
    }

}

