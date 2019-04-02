package com.kata.foobarqix;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

  private FooBarQixStrategies fooBarQixStrategies;

  public FooBarQix() {

    Map<Integer, String> foobarContains = new HashMap<>();
    foobarContains.put(0, "*");
    foobarContains.put(3, "Foo");
    foobarContains.put(5, "Bar");
    foobarContains.put(7, "Qix");

    Map<Integer, String> foobar = new HashMap<>();
    foobar.put(3, "Foo");
    foobar.put(5, "Bar");
    foobar.put(7, "Qix");

    ContainsStrategy containsStrategy = new ContainsStrategy();
    DivisionStrategy divisionStrategy = new DivisionStrategy(foobar);
    fooBarQixStrategies = new FooBarQixStrategies(divisionStrategy, containsStrategy);
  }

  public String compute(String value) {
    return fooBarQixStrategies.compute(value);
  }
}
