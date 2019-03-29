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
	public void should_replace_number_by_Foo_if_divisible_by_3() {
		String value = "3";
		String expected = "Foo";
		
		String result = stringCompute.compute(value);
		
	}
	
	@Test
	public void should_add_Bar_if_number_divisible_by_5() {
		String value = "5";
		String expected ="5Bar";
		
		String result = stringCompute.compute(value);
		assertThat(result, is(equalTo(expected)));
	}
	

}
