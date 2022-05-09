import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer aHpOne;

    @Before
    public void before(){aHpOne = new Printer(20);}

    @Test
    public void hasPages(){assertEquals(20, aHpOne.getPaper());}

    @Test
    public void canPrintDocument(){
        aHpOne.printDocuments(2, 3);
        assertEquals(14, aHpOne.getPaper());
    }

    @Test
    public void willNotPrintTooManyPages(){
        aHpOne.printDocuments(10,6);
        assertEquals(20, aHpOne.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, aHpOne.getToner());
    }

    @Test
    public void canSubtractTonerOnPrint(){
        aHpOne.printDocuments(10,1);
        assertEquals(90, aHpOne.getToner());
    }

}
