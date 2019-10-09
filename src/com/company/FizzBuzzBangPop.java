package com.company;

public class FizzBuzzBangPop {

    public static String convert(int input) {
        if ((FizzBuzzBangPop.isPalindrome(input)) && (input % 3 == 0)) {
            return "FizzPop";
        }
        else if (FizzBuzzBangPop.isPalindrome(input)) {
            return "Pop";
        }
        else if (FizzBuzzBangPop.isPrime(input)) {
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

    private static boolean isPrime(int n) {
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

    private static boolean isPalindrome(int n) {
        int r,sum=0,temp;
//        int n=454;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }


}
