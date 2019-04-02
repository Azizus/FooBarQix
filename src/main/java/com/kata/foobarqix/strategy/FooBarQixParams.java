
package com.kata.foobarqix.strategy;

import static java.util.Arrays.stream;

public class FooBarQixParams<E extends IStrategyParameter> {

  private Class<E> paramsClass;

  public FooBarQixParams(Class<E> paramsClass) {
    this.paramsClass = paramsClass;
  }

  public boolean containsKey(int value) {
    return stream(paramsClass.getEnumConstants()) //
        .anyMatch(p -> p.getValue() == value);
  }

  public String get(int value) {
    return stream(paramsClass.getEnumConstants()) //
        .filter(p -> p.getValue() == value) //
        .findFirst() //
        .map(p -> p.getLabel()) //
        .orElse(null);
  }

  public E[] entrySet() {
    return paramsClass.getEnumConstants();
  }

}
