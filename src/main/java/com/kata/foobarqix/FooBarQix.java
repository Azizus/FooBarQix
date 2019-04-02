package com.kata.foobarqix;

public class FooBarQix {

  private IStrategy[] strategies;

  public FooBarQix(IStrategy... strategy) {
    this.strategies = strategy;
  }

  public String compute(String value) {
    String output = "";
    for (IStrategy strategy : strategies) {
      output += strategy.process(value);
    }

    return output;
  }
}
