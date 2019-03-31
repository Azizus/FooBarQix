package com.kata.foobarqix;

public class StringCompute {

  private IStrategy divisionStrategy;
  private IStrategy containsStrategy;

  public StringCompute(IStrategy divisionStrategy, IStrategy containsStrategy) {
    this.divisionStrategy = divisionStrategy;
    this.containsStrategy = containsStrategy;
  }

  public String compute(String value) {


    String modOutput = divisionStrategy.fbqTreatement(value, divisionStrategy.fbqParams());

    String containOutput = containsStrategy.fbqTreatement(value, containsStrategy.fbqParams());

    return modOutput + containOutput;


  }



}
