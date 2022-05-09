import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator Calc = new Calculator();

    @Before

    @Test
    public void canAdd(){
        int result = Calc.add(5, 5);
        assertEquals(10, result);
    }

    @Test
    public void canSubtract(){
        int result = Calc.subtract(20, 7);
        assertEquals(13, result);
    }

    @Test
    public void canMultiply(){
        int result = Calc.multiply(13, 3);
        assertEquals(39, result);
    }

    @Test
    public void canDivide(){
        double result = Calc.divide(5, 2);
        assertEquals(2.5, result, 0.0);
    }


}
