package com.javadesignpattern;

public class InsuranceStrategyMedium extends InsuranceStrategy {

  @Override
  public int getConstant() {
    return 35600;
  }

  @Override
  public double getWight() {
    return 0.2;
  }

  @Override
  public int getAdjustment() {
    return 10000;
  }
}
