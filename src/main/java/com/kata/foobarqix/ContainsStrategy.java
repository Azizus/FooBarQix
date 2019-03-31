package com.kata.foobarqix;

import java.util.HashMap;
import java.util.Map;

public class ContainsStrategy implements IStrategy {

  @Override
  public Map<Integer, String> fbrParams() {
    Map<Integer, String> foobar = new HashMap<>();
    foobar.put(0, "*");
    foobar.put(3, "Foo");
    foobar.put(5, "Bar");
    foobar.put(7, "Qix");
    return foobar;
  }

}
