package com.kata.foobarqix;

public enum FooBarQixDivisionParams {

  FOO(3, "Foo"), //
  BAR(5, "Bar"), //
  QIX(7, "Qix");

  private int value;
  private String label;

  private FooBarQixDivisionParams(int value, String label) {
    this.value = value;
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public int getValue() {
    return value;
  }

  public static FooBarQixDivisionParams[] entrySet() {
    return values();
  }
}
