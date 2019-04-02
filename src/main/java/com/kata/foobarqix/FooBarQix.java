package com.kata.foobarqix;

public class FooBarQix {

  private IFooBarQixStrategy[] fooBarQixStrategies;

  public FooBarQix(IFooBarQixStrategy... strategy) {
    this.fooBarQixStrategies = strategy;
  }

  public String compute(String value) {
    String output = "";
    for (IFooBarQixStrategy fooBarQixStrategy : fooBarQixStrategies) {
      output += fooBarQixStrategy.compute(value);
    }

    return output;
  }
}
