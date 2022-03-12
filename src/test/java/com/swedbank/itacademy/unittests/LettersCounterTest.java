package com.swedbank.itacademy.unittests;

import letterscountertest.LettersCounter;
import org.junit.jupiter.api.*;

public class LettersCounterTest {
    @BeforeAll
    public static void setup() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void initInitialValues() {
    }

    @AfterAll
    public static void init() {
        System.out.println("After all");
    }

    @Test
    public void testLettersCounter() {
        char character = 'b';
        String text = "dcjsdsdcsncbbasfksdfb";

        int actual = LettersCounter.countLetters(character, text);

        Assertions.assertEquals(3, actual);
    }
}
