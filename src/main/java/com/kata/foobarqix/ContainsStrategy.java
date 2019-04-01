package com.kata.foobarqix;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainsStrategy implements IStrategy {


  private Map<Integer, String> fbqParams() {
    Map<Integer, String> foobar = new HashMap<>();
    foobar.put(0, "*");
    foobar.put(3, "Foo");
    foobar.put(5, "Bar");
    foobar.put(7, "Qix");
    return foobar;
  }

  @Override
  public String process(String value) {

    Map<Integer, String> fbqParams = fbqParams();
    return value.chars().filter(c -> fbqParams.containsKey(Character.getNumericValue(c)))
        .mapToObj(c -> charLoop(Character.getNumericValue(c), fbqParams))
        .collect(Collectors.joining());
  }

  private static String charLoop(int c, Map<Integer, String> foobar) {
    return foobar.containsKey(c) ? foobar.get(c) : String.valueOf(c);
  }


}
