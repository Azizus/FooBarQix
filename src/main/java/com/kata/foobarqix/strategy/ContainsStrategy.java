package com.kata.foobarqix.strategy;

import static java.lang.Character.getNumericValue;
import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;
import com.kata.foobarqix.FooBarQixParams;

public class ContainsStrategy implements IFooBarQixStrategy {

  @Override
  public String compute(String value) {
    return value.chars() //
        .filter(c -> FooBarQixParams.containsKey(getNumericValue(c))) //
        .mapToObj(c -> charLoop(getNumericValue(c))) //
        .collect(joining());
  }

  private String charLoop(int c) {
    return FooBarQixParams.containsKey(c) ? FooBarQixParams.get(c) : valueOf(c);
  }

}
