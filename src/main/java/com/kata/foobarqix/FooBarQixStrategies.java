package com.kata.foobarqix;

public class FooBarQixStrategies implements IFooBarQixStrategy {

  private IFooBarQixStrategy[] fooBarQixStrategies;

  public FooBarQixStrategies(IFooBarQixStrategy... strategy) {
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
