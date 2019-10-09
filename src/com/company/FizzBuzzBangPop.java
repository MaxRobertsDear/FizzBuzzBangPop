package com.company;

public class FizzBuzzBangPop {

    public static String convert(int input) {
        if (FizzBuzzBangPop.checkPrime(input)) {
            return "Bang";
        }
        else if (input % 15 == 0) {
            return "FizzBuzz";
        } else if (input % 5 == 0) {
            return "Buzz";
        } else {
            return "Fizz";
        }
    }

    private static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
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

}
