package com.javadesignpattern;

public abstract class InsuranceStrategy {

  public double calculate(double income) {
    return (income - getAdjustment()) * getWight() + getConstant();
  }

  public abstract int getConstant();

  public abstract double getWight();

  public abstract int getAdjustment();
}
