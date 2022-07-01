package Package1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private static BankAccount bankAccount;

    @BeforeAll
    protected static void setUp() {
        bankAccount = new BankAccount(1000);
    }

    @Test
    void depositShouldBe1200() {
        assertEquals( 1200, bankAccount.deposit(200));
    }

    @Test
    void depositShouldBeZero(){
        assertEquals(0, bankAccount.deposit(5100));
    }

    @Test
    void withdrawShouldBe800() {
        assertEquals( 800, bankAccount.withdraw(200));
    }

    @Test
    void withdrawShouldBeZero() {
        assertEquals( 0, bankAccount.withdraw(1100));

    }
}