package UnitTests;

import HW.HW1;
import org.junit.Assert;
import org.junit.Test;

public class TestHW1 {

    // Task №1
    @Test
    public void testChet1() {
        int exp = 12;
        int act = HW1.Chet(6,8,4);
        Assert.assertEquals (exp, act);
    }

    @Test
    public void testChet2() {
        int exp = 7;
        int act = HW1.Chet(5,6,4);
        Assert.assertEquals (exp, act);
    }

    @Test
    public void testChet3() {
        int exp = 7;
        int act = HW1.Chet(6,8,0);
        Assert.assertEquals (exp, act);
    }

    // Task №2
    @Test
    public void testTicket1(){

        double exp = 800.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals (exp, act, 0);
    }

    @Test
    public void testTicket2(){

        double exp = 1000.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void testTicket3(){

        double exp = 600.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void testTicket4(){

        double exp = 200.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals(exp, act, 0);
    }
}
