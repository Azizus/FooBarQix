package com.kata.foobarqix;

public class StringCompute {

  private IStrategy moduloStrategy;
  private IStrategy strategy;

  public StringCompute(IStrategy moduloStrategy, IStrategy strategy) {
    this.moduloStrategy = moduloStrategy;
    this.strategy = strategy;
  }

  public String compute(String value) {

    String modOutput = StringModulo.mod(value, moduloStrategy.fbrParams());

    String containOutput = StringContains.charContains(value, strategy.fbrParams());

    return modOutput + containOutput;


  }



}
