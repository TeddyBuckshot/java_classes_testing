import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter = new Printer(400,200);

    @Test
    public void canPrint(){
        System.out.println("sheets of paper remaining: "+myPrinter.getNumPagesLeft());
        myPrinter.print(4,10);
        System.out.println("printing...");
        System.out.println("print complete! pages remaining: "+myPrinter.getNumPagesLeft());
        assertEquals(360, myPrinter.getNumPagesLeft());
        System.out.println("\n");
    }

    @Test
    public void usesToner(){
        System.out.println("toner volume: "+myPrinter.getToner());
        myPrinter.print(4,10);
        System.out.println("printing...");
        System.out.println("print complete! new toner volume: "+myPrinter.getToner());
        assertEquals(160, myPrinter.getToner());
    }
}
