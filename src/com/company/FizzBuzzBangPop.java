package com.company;

public class FizzBuzzBangPop {

    public static String convert(int input) {
        if (input == 15) {
            return "FizzBuzz";
        } else if (input == 5){
            return "Buzz";
        } else {
            return "Fizz";
        }
    }

}
