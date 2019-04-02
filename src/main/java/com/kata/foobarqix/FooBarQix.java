package com.kata.foobarqix;

import com.kata.foobarqix.strategy.ContainsStrategy;
import com.kata.foobarqix.strategy.DivisionStrategy;
import com.kata.foobarqix.strategy.FooBarQixStrategies;

public class FooBarQix {

  private FooBarQixStrategies fooBarQixStrategies;

  public FooBarQix() {
    ContainsStrategy containsStrategy = new ContainsStrategy();
    DivisionStrategy divisionStrategy = new DivisionStrategy();
    fooBarQixStrategies = new FooBarQixStrategies(divisionStrategy, containsStrategy);
  }

  public String compute(String value) {
    return fooBarQixStrategies.compute(value);
  }
}
