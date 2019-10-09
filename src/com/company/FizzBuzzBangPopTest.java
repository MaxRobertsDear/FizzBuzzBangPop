package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzBangPopTest {

    @Test
    void convert_Fizz() {
        assertEquals("Fizz", FizzBuzzBangPop.convert(3));
        assertEquals("Fizz", FizzBuzzBangPop.convert(6));
        assertEquals("Fizz", FizzBuzzBangPop.convert(9));
        assertEquals("Fizz", FizzBuzzBangPop.convert(33));
        assertEquals("Fizz", FizzBuzzBangPop.convert(36));
    }

    @Test
    void convert_Buzz() {
        assertEquals("Buzz", FizzBuzzBangPop.convert(5));
        assertEquals("Buzz", FizzBuzzBangPop.convert(10));
        assertEquals("Buzz", FizzBuzzBangPop.convert(50));
        assertEquals("Buzz", FizzBuzzBangPop.convert(55));
        assertEquals("Buzz", FizzBuzzBangPop.convert(65));
    }

    @Test
    void convert_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(15));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(30));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(150));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(45));
        assertEquals("FizzBuzz", FizzBuzzBangPop.convert(60));
    }


}