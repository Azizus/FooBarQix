package com.kata.foobarqix;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.joining;
import java.util.Map;

public class DivisionStrategy implements IStrategy {
  private Map<Integer, String> fbqParams;

  public DivisionStrategy(Map<Integer, String> fbqParams) {
    this.fbqParams = fbqParams;
  }

  @Override
  public String process(String value) {
    String output = fbqParams.entrySet().stream() //
        .filter(e -> parseInt(value) % e.getKey() == 0) //
        .map(e -> e.getValue()) //
        .collect(joining());

    return output.isEmpty() ? value : output;
  }
}
