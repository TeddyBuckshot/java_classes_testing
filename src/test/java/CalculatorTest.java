import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator myCalc = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(4, myCalc.add(2,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(0, myCalc.subtract(2,2));
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, myCalc.divide(5.0,2.0), 0.0);
    }

    @Test
    public void canMultiply(){
        assertEquals(8, myCalc.multiply(2,4));
    }
}