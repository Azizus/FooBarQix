package com.kata.foobarqix.strategy;

import static java.lang.Character.getNumericValue;
import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;
import com.kata.foobarqix.ContainsParams;
import com.kata.foobarqix.FooBarQixParams;

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
