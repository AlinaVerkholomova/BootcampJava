package Package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private static BankAccount bankAccount;

    @Test
    void depositShouldBe1200() {
        bankAccount = new BankAccount(1000);
        assertEquals( 1200, bankAccount.deposit(200));
    }

    @Test
    void depositShouldBeZero(){
        bankAccount = new BankAccount(1000);
        assertEquals(0, bankAccount.deposit(5100));
    }

    @Test
    void withdrawShouldBe800() {
        bankAccount = new BankAccount(1000);
        assertEquals( 800, bankAccount.withdraw(200));
    }

    @Test
    void withdrawShouldBeZero() {
        bankAccount = new BankAccount(1000);
        assertEquals( 0, bankAccount.withdraw(1100));

    }
}