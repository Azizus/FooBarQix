package com.kata.foobarqix.strategy.contains;

import com.kata.foobarqix.strategy.IStrategyParameter;

public enum ContainsParams implements IStrategyParameter {

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
