package com.kata.foobarqix.strategy;

public class FooBarQixStrategies implements IFooBarQixStrategy {

  private IFooBarQixStrategy[] fooBarQixStrategies;

  public FooBarQixStrategies(IFooBarQixStrategy... strategy) {
    this.fooBarQixStrategies = strategy;
  }

  public String compute(String value) {
    String output = "";
    for (IFooBarQixStrategy strategy : fooBarQixStrategies) {
      output += strategy.compute(value);
    }

    return output;
  }
}
