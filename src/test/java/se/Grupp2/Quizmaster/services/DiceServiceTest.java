package se.Grupp2.Quizmaster.services;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testing class for DiceService class")
class DiceServiceTest {

    static DiceService classToBeTested;

    @BeforeAll
    public static void initAll() {
        System.out.println("*** Initializing Test with new instance of class to be tested ***");
        classToBeTested = new DiceService();
    }

    @BeforeEach
    public void startOfTest() {
        System.out.println("> Commencing new individual test");
    }

    @AfterEach
    public void endOfTest() {
        System.out.println("Test completed!");
    }

    @Test
    void diceRoll() {
    }

    @AfterAll
    static void tearDownAll() {
        classToBeTested = null;
        System.out.println("*** Testing complete. Clering Test ***");
    }
}