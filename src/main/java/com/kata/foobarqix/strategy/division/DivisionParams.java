package com.kata.foobarqix.strategy.division;

import com.kata.foobarqix.strategy.IStrategyParameter;

public enum DivisionParams implements IStrategyParameter {

  FOO(3, "Foo"), //
  BAR(5, "Bar"), //
  QIX(7, "Qix");

  private int value;
  private String label;

  private DivisionParams(int value, String label) {
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
