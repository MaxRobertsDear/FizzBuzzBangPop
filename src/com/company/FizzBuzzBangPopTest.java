package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzBangPopTest {

    @Test
    void convert_Fizz() {
        assertEquals("Fizz", FizzBuzzBangPop.convert(3));
    }
}