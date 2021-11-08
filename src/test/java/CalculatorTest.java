import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addNumbers(){
        assertEquals(20, calculator.add(10, 10));
    }

    @Test
    public void subtractNumbers(){
        assertEquals(0, calculator.subtract(10, 10));
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(9, calculator.multiply(3, 3));
    }

    @Test
    public void divideNumbers(){
        assertEquals(1, calculator.divide(3, 3), 0.0);
    }

}









