package com.kata.foobarqix;

public class StringCompute {

  private IStrategy divisionStrategy;
  private IStrategy containsStrategy;

  public StringCompute(IStrategy divisionStrategy, IStrategy containsStrategy) {
    this.divisionStrategy = divisionStrategy;
    this.containsStrategy = containsStrategy;
  }

  public String compute(String value) {

    String modOutput = divisionStrategy.process(value);

    String containOutput = containsStrategy.process(value);

    return modOutput + containOutput;


  }



}
