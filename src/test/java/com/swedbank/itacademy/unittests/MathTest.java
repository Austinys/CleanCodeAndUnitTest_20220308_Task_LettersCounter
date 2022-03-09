package com.swedbank.itacademy.unittests;

import org.junit.jupiter.api.*;

public class MathTest {
    @BeforeAll
    public static void setup() {
        System.out.println("Before all");
    }

    @BeforeEach public void initInitialValues() {

    }

    @AfterAll
    public static void init() {
        System.out.println("After all");
    }

    @Test
    public void testSubtraction() {
        int left = 4;
        int right = 2;
        int actual = Math.subtractExact(left, right);

/*        Assertions.assertEquals(2, actual);
        Assertions.assertEquals(1, actual);
        Assertions.assertEquals(2, actual);*/

        // Kad  visas salygas patikrintu naudojame assertAll, nes auksciau buvo,
        // kad sustoja ties pirma klaida ir kitu netikrina:
        Assertions.assertAll("math",
                () -> Assertions.assertEquals(2, actual),
                () -> Assertions.assertEquals(1, actual),
                () -> Assertions.assertEquals(2, actual));

    }

    @Test
    public void catchThrowable() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Math.floorDiv(0, 0);

        });



    }




}
