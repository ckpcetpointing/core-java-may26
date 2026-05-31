package com.jsn.core.java.basic.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EmployeeServiceTest {

    EmployeeService employeeService;

    @BeforeAll
    static void initAll() {
        System.out.println("Initializing resources before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Setting up EmployeeService instance before each test");
        employeeService = new EmployeeService();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after each test");
        employeeService = null;
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Cleaning up resources after all tests");
    }

    @Test
    void calculateBonus_For_NegativeSalary() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> employeeService.calculateBonus(-1000), "Expected IllegalArgumentException for negative salary");
    }

    @Test
    @DisplayName("Calculate bonus for a valid salary")
    void calculateBonus_For_ValidSalary() {
        double bonus = employeeService.calculateBonus(5000);
        assert bonus == 1000 : "Expected bonus to be 20% of the salary";
    }

    @Test
    void calculateBonus_For_ZeroSalary() {
        double bonus = employeeService.calculateBonus(0);
        assert bonus == 0 : "Expected bonus to be 0 for zero salary";
    }

    @Test
    void isEligibleForPromotion_For_YearsOfService() {
        Assertions.assertTrue(employeeService.isEligibleForPromotion(5),
                "Expected eligibility for promotion with 5 years of service");

        Assertions.assertTrue(employeeService.isEligibleForPromotion(5));
    }

    @ParameterizedTest
    @ValueSource(ints = {5,6,10})
    void isEligibleForPromotion_For_MoreThan4YearsOfService(int yearsOfService) {
        Assertions.assertTrue(employeeService.isEligibleForPromotion(yearsOfService),
                "Expected eligibility for promotion with more than 4 years of service");
    }

}

/**
 * Create TransactionService class
 *
 * -contructor
 * -deposit
 * -withdrawal
 *
 * jnit test for TransactionService
 */