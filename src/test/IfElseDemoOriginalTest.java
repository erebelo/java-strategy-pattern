package test;

import static org.junit.Assert.assertEquals;

import com.javadesignpattern.original.IfElseDemoOriginal;
import org.junit.Test;

public class IfElseDemoOriginalTest {

  @Test
  public void low() {
    assertEquals(1825, insuranceFor(5000), 0.01);
  }

  @Test
  public void medium() {
    assertEquals(38600, insuranceFor(25000), 0.01);
  }

  @Test
  public void high() {
    assertEquals(78500, insuranceFor(50000), 0.01);
  }

  @Test
  public void veryHigh() {
    assertEquals(106400, insuranceFor(100_000), 0.01);
  }

  private double insuranceFor(double income) {
    return new IfElseDemoOriginal().calculateInsurance(income);
  }

}
