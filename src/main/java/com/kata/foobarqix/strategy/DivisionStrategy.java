package com.kata.foobarqix.strategy;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
import com.kata.foobarqix.DivisionParams;
import com.kata.foobarqix.FooBarQixParams;

public class DivisionStrategy implements IFooBarQixStrategy {

  private FooBarQixParams<DivisionParams> params;

  public DivisionStrategy(FooBarQixParams<DivisionParams> params) {
    this.params = params;
  }

  @Override
  public String compute(String value) {
    String output = stream(params.entrySet()) //
        .filter(e -> parseInt(value) % e.getValue() == 0) //
        .map(e -> e.getLabel()) //
        .collect(joining());

    return output.isEmpty() ? value : output;
  }
}
