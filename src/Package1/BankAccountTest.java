package Package1;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private static BankAccount bankAccount;

    @BeforeAll
    protected static void setUp() {
        bankAccount = new BankAccount(1000);
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        assertEquals( 1200, bankAccount.deposit(200));
        assertEquals(0, bankAccount.deposit(5100));
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        assertEquals( 800, bankAccount.withdraw(200));
        assertEquals( 0, bankAccount.withdraw(1100));

    }
}