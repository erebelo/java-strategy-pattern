package com.javadesignpattern;

public class InsuranceStrategyLow extends InsuranceStrategy {

  @Override
  public int getConstant() {
    return 0;
  }

  @Override
  public double getWight() {
    return 0.365;
  }

  @Override
  public int getAdjustment() {
    return 0;
  }
}
