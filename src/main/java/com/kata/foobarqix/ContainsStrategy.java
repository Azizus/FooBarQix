package com.kata.foobarqix;

import static java.lang.Character.getNumericValue;
import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;
import java.util.Map;

public class ContainsStrategy implements IStrategy {

  private Map<Integer, String> fbqParams;

  public ContainsStrategy(Map<Integer, String> fbqParams) {
    this.fbqParams = fbqParams;
  }

  @Override
  public String process(String value) {
    return value.chars() //
        .filter(c -> fbqParams.containsKey(getNumericValue(c))) //
        .mapToObj(c -> charLoop(getNumericValue(c), fbqParams)) //
        .collect(joining());
  }

  private static String charLoop(int c, Map<Integer, String> foobar) {
    return foobar.containsKey(c) ? foobar.get(c) : valueOf(c);
  }

}
