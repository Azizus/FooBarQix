package com.kata.foobarqix;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DivisionStrategy implements IStrategy {

  @Override
  public Map<Integer, String> fbqParams() {
    Map<Integer, String> foobar = new HashMap<>();
    foobar.put(3, "Foo");
    foobar.put(5, "Bar");
    foobar.put(7, "Qix");
    return foobar;
  }

  @Override
  public String fbqTreatement(String value, Map<Integer, String> fbqParams) {

    String output =
        fbqParams.entrySet().stream().filter(v -> Integer.parseInt(value) % v.getKey() == 0)
            .map(v -> v.getValue()).collect(Collectors.joining());

    return output.isEmpty() ? value : output;
  }
}
