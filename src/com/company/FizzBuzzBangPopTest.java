package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzBangPopTest {

    @Test
    void convert_3_Fizz() {
        assertEquals("Fizz", FizzBuzzBangPop.convert(27));
        assertEquals("Fizz", FizzBuzzBangPop.convert(6));
        assertEquals("Fizz", FizzBuzzBangPop.convert(9));
        assertEquals("Fizz", FizzBuzzBangPop.convert(33));
        assertEquals("Fizz", FizzBuzzBangPop.convert(36));
    }

    @Test
    void convert_5_Buzz() {
        assertEquals("Buzz", FizzBuzzBangPop.convert(500));
        assertEquals("Buzz", FizzBuzzBangPop.convert(10));
        assertEquals("Buzz", FizzBuzzBangPop.convert(50));
        assertEquals("Buzz", FizzBuzzBangPop.convert(55));
        assertEquals("Buzz", FizzBuzzBangPop.convert(65));
    }

    @Test
    void convert_15_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(15));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(30));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(150));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(45));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(60));
    }

    @Test
    void convert_prime_Bang() {
        assertEquals("Bang", FizzBuzzBangPop.convert(3));
        assertEquals("Bang", FizzBuzzBangPop.convert(17));
        assertEquals("Bang", FizzBuzzBangPop.convert(101));
        assertEquals("Bang", FizzBuzzBangPop.convert(139));
        assertEquals("Bang", FizzBuzzBangPop.convert(191));
    }

    @Test
    void convert_palindrome_Pop() {
        assertEquals("Pop", FizzBuzzBangPop.convert(44));
        assertEquals("Pop", FizzBuzzBangPop.convert(55));
        assertEquals("Pop", FizzBuzzBangPop.convert(66));
        assertEquals("Pop", FizzBuzzBangPop.convert(77));
        assertEquals("Pop", FizzBuzzBangPop.convert(8558));
    }

    @Test
    void convert_palindromeAndMultipleOf3_Pop() {
        assertEquals("FizzPop", FizzBuzzBangPop.convert(33));
        assertEquals("FizzPop", FizzBuzzBangPop.convert(333));
        assertEquals("FizzPop", FizzBuzzBangPop.convert(66));
        assertEquals("FizzPop", FizzBuzzBangPop.convert(666));
        assertEquals("FizzPop", FizzBuzzBangPop.convert(3663));
    }

}