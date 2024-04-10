package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
    Calculator multiply;
    Calculator subtract;

    Calculator divide;
      @Test
    public void testAdd(){
        myCalc = new Calculator();
        assertEquals(40, myCalc.add(20,20));
    }

    @Test
    public void testMultiple(){
          multiply = new Calculator();
          assertEquals(25,multiply.multiple(5,5));
    }

    @Test
    public void testSubtracting(){
          subtract = new Calculator();
          assertEquals(10, subtract.subtract(20,10));
    }

    @Test
    public void testDividing(){
          divide = new Calculator();
          assertEquals(5,divide.divide(20,4));
    }
}
