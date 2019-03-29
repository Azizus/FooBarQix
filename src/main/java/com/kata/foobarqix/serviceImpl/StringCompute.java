package com.kata.foobarqix.serviceImpl;

public class StringCompute {

	public String compute(String value) {
		
		if (Integer.parseInt(value) % 3 == 0)
			return "Foo";
		return value;
	}

}
