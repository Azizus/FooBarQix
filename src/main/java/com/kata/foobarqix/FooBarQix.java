package com.kata.foobarqix;

import com.kata.foobarqix.strategy.ContainsStrategy;
import com.kata.foobarqix.strategy.DivisionStrategy;
import com.kata.foobarqix.strategy.FooBarQixStrategies;

public class FooBarQix {

  private FooBarQixStrategies fooBarQixStrategies;

  public FooBarQix() {
    FooBarQixParams<ContainsParams> containsParams =
        new FooBarQixParams<>(ContainsParams.class);
    ContainsStrategy containsStrategy = new ContainsStrategy(containsParams);


    FooBarQixParams<DivisionParams> divisionParams =
        new FooBarQixParams<>(DivisionParams.class);
    DivisionStrategy divisionStrategy = new DivisionStrategy(divisionParams);

    fooBarQixStrategies = new FooBarQixStrategies(divisionStrategy, containsStrategy);
  }

  public String compute(String value) {
    return fooBarQixStrategies.compute(value);
  }
}
