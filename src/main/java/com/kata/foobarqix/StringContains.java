package com.kata.foobarqix;

import java.util.Map;
import java.util.stream.Collectors;

public class StringContains {


  public static String charContains(String value, Map<Integer, String> fbrParams) {

    return value.chars().filter(c -> fbrParams.containsKey(Character.getNumericValue(c)))
        .mapToObj(c -> charLoop(Character.getNumericValue(c), fbrParams))
        .collect(Collectors.joining());
  }

  private static String charLoop(int c, Map<Integer, String> foobar) {
    return foobar.containsKey(c) ? foobar.get(c) : String.valueOf(c);
  }
}
