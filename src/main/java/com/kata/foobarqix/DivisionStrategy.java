package com.kata.foobarqix;

import java.util.Map;
import java.util.stream.Collectors;

public class DivisionStrategy implements IStrategy {
  private Map<Integer, String> fbqParams;

  public DivisionStrategy(Map<Integer, String> fbqParams) {
    this.fbqParams = fbqParams;
  }

  @Override
  public String process(String value) {
    String output =
        fbqParams.entrySet().stream().filter(v -> Integer.parseInt(value) % v.getKey() == 0)
            .map(v -> v.getValue()).collect(Collectors.joining());

    return output.isEmpty() ? value : output;
  }
}
