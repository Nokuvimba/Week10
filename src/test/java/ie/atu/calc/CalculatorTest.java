package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
    Calculator multiply;
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
}
