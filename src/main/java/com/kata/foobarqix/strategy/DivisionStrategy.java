package com.kata.foobarqix.strategy;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.joining;
import java.util.Arrays;
import com.kata.foobarqix.FooBarQixDivisionParams;

public class DivisionStrategy implements IFooBarQixStrategy {

  @Override
  public String compute(String value) {
    String output = Arrays.stream(FooBarQixDivisionParams.entrySet()) //
        .filter(e -> parseInt(value) % e.getValue() == 0) //
        .map(e -> e.getLabel()) //
        .collect(joining());

    return output.isEmpty() ? value : output;
  }
}
