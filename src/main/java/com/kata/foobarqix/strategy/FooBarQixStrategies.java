package com.kata.foobarqix.strategy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FooBarQixStrategies implements IFooBarQixStrategy {

  private IFooBarQixStrategy[] fooBarQixStrategies;

  public FooBarQixStrategies(IFooBarQixStrategy... strategy) {
    this.fooBarQixStrategies = strategy;
  }

  public String compute(String value) {
    return Arrays.stream(fooBarQixStrategies)//
        .map(strategy -> strategy.compute(value))//
        .collect(Collectors.joining());

  }
}
