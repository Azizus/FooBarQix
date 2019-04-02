package com.kata.foobarqix;

public enum ContainsParams implements IFooBarQixParams {

  STAR(0, "*"), //
  FOO(3, "Foo"), //
  BAR(5, "Bar"), //
  QIX(7, "Qix");

  private int value;
  private String label;

  private ContainsParams(int value, String label) {
    this.value = value;
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public int getValue() {
    return value;
  }
}
