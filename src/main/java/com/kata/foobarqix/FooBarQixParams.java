package com.kata.foobarqix;

import static java.util.Arrays.stream;

public class FooBarQixParams {

  public static boolean containsKey(int value) {
    return stream(FooBarQixContainsParams.values()) //
        .anyMatch(p -> p.getValue() == value);
  }

  public static String get(int value) {
    return stream(FooBarQixContainsParams.values()) //
        .filter(p -> p.getValue() == value) //
        .findFirst() //
        .map(p -> p.getLabel()) //
        .orElse(null);
  }

  public static IFooBarQixParams[] entrySet() {
    return FooBarQixDivisionParams.values();
  }

}
