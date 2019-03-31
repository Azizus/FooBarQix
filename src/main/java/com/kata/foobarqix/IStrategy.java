package com.kata.foobarqix;

import java.util.Map;

public interface IStrategy {

  public Map<Integer, String> fbqParams();

  public String fbqTreatement(String value, Map<Integer, String> fbqParams);


}
