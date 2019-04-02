package com.kata.foobarqix;

import com.kata.foobarqix.strategy.FooBarQixParams;
import com.kata.foobarqix.strategy.FooBarQixStrategies;
import com.kata.foobarqix.strategy.contains.ContainsParams;
import com.kata.foobarqix.strategy.contains.ContainsStrategy;
import com.kata.foobarqix.strategy.division.DivisionParams;
import com.kata.foobarqix.strategy.division.DivisionStrategy;

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
