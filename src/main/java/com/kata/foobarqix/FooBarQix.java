package com.kata.foobarqix;

public class FooBarQix {

  private IStrategy divisionStrategy;
  private IStrategy containsStrategy;

  public FooBarQix(IStrategy divisionStrategy, IStrategy containsStrategy) {
    this.divisionStrategy = divisionStrategy;
    this.containsStrategy = containsStrategy;
  }

  public String compute(String value) {

    String modOutput = divisionStrategy.process(value);

    String containOutput = containsStrategy.process(value);

    return modOutput + containOutput;
  }
}
