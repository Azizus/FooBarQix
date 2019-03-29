package com.kata.foobarqix.serviceImpl;

public class StringCompute {

	public String compute(String value) {
		String output = value;
		boolean divBy3 = false;

		if (Integer.parseInt(value) % 3 == 0) {
			output = "Foo";
			divBy3 = true;
		}

		if (Integer.parseInt(value) % 5 == 0)
			output = output.concat("Bar");
		if (Integer.parseInt(value) % 7 == 0)
			output = output.concat("Qix");

		for (int i = 0; i < value.length(); i++) {
			if (divBy3) {
				if (value.charAt(i) == '3')
					output = output.concat("Foo");
				if (value.charAt(i) == '5')
					output = output.concat("Bar");
				if (value.charAt(i) == '7')
					output = output.concat("Qix");
				if (value.charAt(i) == '0')
					output = output.concat("*");
			} else {
				if (value.charAt(i) == '3')
					output = output.replace("3", "Foo");
				if (value.charAt(i) == '5')
					output = output.replace("5", "Bar");
				if (value.charAt(i) == '7')
					output = output.replace("7", "Qix");
				if (value.charAt(i) == '0')
					output = output.replace("0", "*");
			}
		}
		return output;
	}

}
