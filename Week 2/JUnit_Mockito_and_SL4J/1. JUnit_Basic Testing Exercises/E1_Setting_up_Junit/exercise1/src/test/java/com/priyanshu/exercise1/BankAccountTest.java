package com.priyanshu.exercise1;

import org.junit.*;
import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;
    
    // Setup method (runs BEFORE each test)
    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        account = new BankAccount(1000); // Initial balance: 1000
    }
    
    // Teardown method (runs AFTER each test)
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        account = null;
    }

    // Test 1: Deposit (AAA Pattern)
    @Test
    public void testDeposit() {
        // Arrange
        double amount = 500;
        
        // Act
        account.deposit(amount);
        
        // Assert
        assertEquals(1500, account.getBalance(), 0.001);
    }

    // Test 2: Withdraw (AAA Pattern)
    @Test
    public void testWithdraw() {
        // Arrange
        double amount = 200;
        
        // Act
        account.withdraw(amount);
        
        // Assert
        assertEquals(800, account.getBalance(), 0.001);
    }
}