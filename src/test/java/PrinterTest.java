import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30, 100);
    }

    @Test
    public void hasPaper() { assertEquals(30, printer.paper());}

    @Test
    public void canPrintTrue() { assertEquals(24, printer.print(4, 6));}

    @Test
    public void canPrintFalse() { assertEquals(0, printer.print(10, 7));}

    @Test
    public void hasToner() { assertEquals(100, printer.toner());}

    @Test
    public void removeToner() { assertEquals(76, printer.useToner(printer.print(4,6))); }


}
