package com.kata.foobarqix.serviceImpl;

public class StringCompute {

	public String compute(String value) {
		String output = value;
		if (Integer.parseInt(value) % 3 == 0)
			output = "Foo";
		if (Integer.parseInt(value) % 5 == 0)
			output = output.concat("Bar");
		if (Integer.parseInt(value) % 7 ==0)
			output = output.concat("Qix");
		return output;
	}

}
