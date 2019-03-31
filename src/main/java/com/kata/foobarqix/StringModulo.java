package com.kata.foobarqix;

import java.util.Map;
import java.util.stream.Collectors;

public class StringModulo {

  public static String mod(String value, Map<Integer, String> modulo) {

    String output =
        modulo.entrySet().stream().filter(v -> Integer.parseInt(value) % v.getKey() == 0)
            .map(v -> v.getValue()).collect(Collectors.joining());

    return output.isEmpty() ? value : output;
  }

}
