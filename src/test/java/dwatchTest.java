import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class dwatchTest {
    @Test
    void test1() {
        dwatch d = new dwatch();
        assertEquals(" On!",d.turnOn());
    }
    @Test
    public void test2(){
        dwatch d = new dwatch();
        assertEquals(" On!",d.turnOn());
        assertEquals("Already on",d.turnOn());
    }
    @Test
    public void test3(){
        dwatch d = new dwatch();
        assertEquals(" On!",d.turnOn());
        assertEquals("Already on",d.turnOn());
        assertEquals("Turned off",d.turnOff());
    }

    @Test
    public void test4(){
        dwatch d = new dwatch();
        assertEquals(" On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        assertEquals("Wait for timer to end",d.doSomething());
    }

    @Test
    public void test5(){
        dwatch d = new dwatch();
        assertEquals(" On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.timerState = false;
        assertEquals("Accepted",d.doSomething());
        assertEquals("Turned off",d.turnOff());
    }
}
