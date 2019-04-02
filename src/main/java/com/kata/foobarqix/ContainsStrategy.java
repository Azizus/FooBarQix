package com.kata.foobarqix;

import static java.lang.Character.getNumericValue;
import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class ContainsStrategy implements IFooBarQixStrategy {

  @Override
  public String compute(String value) {
    return value.chars() //
        .filter(c -> FooBarQixContainsParams.containsKey(getNumericValue(c))) //
        .mapToObj(c -> charLoop(getNumericValue(c))) //
        .collect(joining());
  }

  private String charLoop(int c) {
    return FooBarQixContainsParams.containsKey(c) ? FooBarQixContainsParams.get(c) : valueOf(c);
  }

}
