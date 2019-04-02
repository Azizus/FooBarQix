package com.kata.foobarqix.strategy.contains;

import static java.lang.Character.getNumericValue;
import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;
import com.kata.foobarqix.strategy.FooBarQixParams;
import com.kata.foobarqix.strategy.IFooBarQixStrategy;

public class ContainsStrategy implements IFooBarQixStrategy {

  private FooBarQixParams<ContainsParams> params;

  public ContainsStrategy(FooBarQixParams<ContainsParams> params) {
    this.params = params;
  }

  @Override
  public String compute(String value) {
    return value.chars() //
        .filter(c -> params.containsKey(getNumericValue(c))) //
        .mapToObj(c -> charLoop(getNumericValue(c))) //
        .collect(joining());
  }

  private String charLoop(int c) {
    return params.containsKey(c) ? params.get(c) : valueOf(c);
  }

}
