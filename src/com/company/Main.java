package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + FizzBuzzBangPop.convert(i) + " score: "+ FizzBuzzBangPop.score(i));
        }
        highScore(100);
    }

    private static HashMap<Integer, Integer> highScore(int listSize) {

        HashMap<Integer, Integer> keyValues = new HashMap<>();

        for (int i = 0; i < listSize; i++) {
            int key = i;
            int value = FizzBuzzBangPop.score(i);
            keyValues.put(key, value);
        }
        int maxValue = Collections.max(keyValues.values());
        int maxValueKey = 0;

        for (Map.Entry<Integer, Integer> entry : keyValues.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxValueKey = entry.getKey();
            }
        }

        System.out.println("key: " + maxValueKey + " with value: " + maxValue);
        return keyValues;

    }

}
