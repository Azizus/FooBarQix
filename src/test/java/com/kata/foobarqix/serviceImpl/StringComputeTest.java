package com.kata.foobarqix.serviceImpl;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StringComputeTest {

	private StringCompute stringCompute;
	
	@Before
	public void initialize() {
		stringCompute = new StringCompute();
	}

	@Test
	public void should_replace_number_by_foo_if_divisible_by_3() {
		int value = 3;
		String expected = "Foo";
		String result = stringCompute.compute(value);
		
		assertThat(result, is(equalTo(expected)));
	}

}
