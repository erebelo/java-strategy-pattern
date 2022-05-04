package com.javadesignpattern;

public class InsuranceStrategyHighPlus extends InsuranceStrategy {

  @Override
  public int getConstant() {
    return 105600;
  }

  @Override
  public double getWight() {
    return 0.02;
  }

  @Override
  public int getAdjustment() {
    return 60000;
  }
}
