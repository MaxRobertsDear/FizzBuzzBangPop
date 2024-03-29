package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FizzBuzzBangPop {


    public static String convert(int input) {

        if ((FizzBuzzBangPop.isPalindrome(input)) && (FizzBuzzBangPop.isPrime(input))) {
            return "BangPop";
        } else if ((FizzBuzzBangPop.isPalindrome(input)) && (FizzBuzzBangPop.isDivisibleBy5(input))) {
            return "BuzzPop";
        } else if ((FizzBuzzBangPop.isPalindrome(input)) && (FizzBuzzBangPop.isDivisibleBy3(input))) {
            return "FizzPop";
        } else if (FizzBuzzBangPop.isPalindrome(input)) {
            return "Pop";
        } else if (FizzBuzzBangPop.isPrime(input) && (FizzBuzzBangPop.isDivisibleBy3(input))) {
            return "FizzBang";
        } else if (FizzBuzzBangPop.isPrime(input)) {
            return "Bang";
        } else if ((FizzBuzzBangPop.isDivisibleBy3(input)) && (FizzBuzzBangPop.isDivisibleBy5(input))) {
            return "FizzBuzz";
        } else if (FizzBuzzBangPop.isDivisibleBy5(input)) {
            return "Buzz";
        } else if (FizzBuzzBangPop.isDivisibleBy3(input)) {
            return "Fizz";
        } else {
            return Integer.toString(input);
        }
    }


    public static int score(int number) {
        int finalScore = 0;

        int lastDigit = number % 10;

        finalScore += lastDigit;

        String sound = FizzBuzzBangPop.convert(number);
        if (sound.contains("Fizz")) finalScore += 3;
        if (sound.contains("Buzz")) finalScore += 5;
        if (sound.contains("Bang")) finalScore += 7;
        if (sound.contains("Pop")) finalScore -= 5;

        return finalScore;
    }


    public static String highScore(int listSize) {

        HashMap<Integer, Integer> keyValues = new HashMap<>();
        for (int i = 0; i < listSize; i++) {
            int key = i;
            int value = FizzBuzzBangPop.score(i);
            keyValues.put(key, value);
        }

        int maxValue = Collections.max(keyValues.values());
        HashMap<Integer, Integer> maxValueKeysMap = new HashMap<>();

        // adds the keys correlating to the max value to the maxValueKeysMap
        for (Map.Entry<Integer, Integer> entry : keyValues.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxValueKeysMap.put(entry.getKey(), maxValue);
            }
        }

        return ("key set: " + maxValueKeysMap.keySet().toString() + " has the highest value, which is: " + maxValue);
    }


    // lifted from online #WhyDoItIfAlreadyDoneBySomeoneElse
    private static boolean isPrime(int n) {
        int i, m, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            if (flag == 0) {
                return true;
            }
            return true;
        }
    }

    // lifted from online: #WhyDoItIfAlreadyDoneBySomeoneElse
    private static boolean isPalindrome(int n) {
        int r, sum = 0, temp;
        int input = n;
        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum && input > 10)
            return true;
        else
            return false;
    }

    private static boolean isDivisibleBy3(int n) {
        if (n % 3 == 0) return true;
        else return false;
    }

    private static boolean isDivisibleBy5(int n) {
        if (n % 5 == 0) return true;
        else return false;
    }




}
