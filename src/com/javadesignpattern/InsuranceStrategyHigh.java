package com.javadesignpattern;

public class InsuranceStrategyHigh extends InsuranceStrategy {

  @Override
  public int getConstant() {
    return 76500;
  }

  @Override
  public double getWight() {
    return 0.1;
  }

  @Override
  public int getAdjustment() {
    return 30000;
  }
}
