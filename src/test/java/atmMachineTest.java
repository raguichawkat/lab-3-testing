import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class atmMachineTest {
    @Test
    public void test1(){
        atmMachine a = new atmMachine();
        a.valid_card = false;
        assertEquals("Card not valid",a.Card());
    }
    @Test
    public void test2(){
        atmMachine a = new atmMachine();
        assertEquals("Valid card",a.Card());
    }
    @Test
    public void test3(){
        atmMachine a = new atmMachine();
        assertEquals("Successful login",a.Password());
    }
    @Test
    public void test4(){
        atmMachine a = new atmMachine();
        assertEquals("Valid card",a.Card());
        a.password_valid = false;
        assertEquals("Wrong password",a.Password());
    }
    @Test
    public void test5(){
        atmMachine a = new atmMachine();
        assertEquals("Valid card",a.Card());
        assertEquals("Successful login",a.Password());
        assertEquals("Enter valid amount",a.deposit(20));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test6(){
        atmMachine a = new atmMachine();
        assertEquals("Valid card",a.Card());
        assertEquals("Successful login",a.Password());
        assertEquals("Successful deposit",a.deposit(100));
        assertEquals("Successful withdraw",a.withdraw(50));
    }
    @Test
    public void test7(){
        atmMachine a = new atmMachine();
        assertEquals("Valid card",a.Card());
        assertEquals("Successful login",a.Password());
        assertEquals("Successful deposit",a.deposit(500));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void test8(){
        atmMachine a = new atmMachine();
        assertEquals("Valid card",a.Card());
        assertEquals("Successful login",a.Password());
        assertEquals("Successful deposit",a.deposit(3000));
        assertEquals("Successful withdraw",a.withdraw(1500));
        assertEquals("Successful withdraw",a.withdraw(1500));
    }

}
