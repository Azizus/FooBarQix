package com.kata.foobarqix;

import static java.util.Arrays.stream;

public enum FooBarQixContainsParams {

  STAR(0, "*"), //
  FOO(3, "Foo"), //
  BAR(5, "Bar"), //
  QIX(7, "Qix");

  private int value;
  private String label;

  private FooBarQixContainsParams(int value, String label) {
    this.value = value;
    this.label = label;
  }

  public static boolean containsKey(int value) {
    return stream(values()) //
        .anyMatch(p -> p.value == value);
  }

  public static String get(int value) {
    return stream(values()) //
        .filter(p -> p.value == value) //
        .findFirst() //
        .map(p -> p.label) //
        .orElse(null);
  }

}
