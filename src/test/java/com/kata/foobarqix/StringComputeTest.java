package com.kata.foobarqix;

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
  private IStrategy divisionStrategy;
  private IStrategy containsStrategy;

  @Before
  public void initialize() {
    containsStrategy = new ContainsStrategy();
    divisionStrategy = new DivisionStrategy();
    stringCompute = new StringCompute(divisionStrategy, containsStrategy);
  }

  @Test
  public void should_replace_number_by_Foo_if_divisible_by_3() {
    String value = "3";
    String expected = "FooFoo";
    String result = stringCompute.compute(value);

    assertThat(result, is(equalTo(expected)));
  }


  @Test
  public void should_replace_number_by_FooBar_if_divisible_by_3() {
    String value = "35";
    String expected = "BarQixFooBar";
    String result = stringCompute.compute(value);

    assertThat(result, is(equalTo(expected)));
  }

  @Test
  public void should_add_Bar_if_number_divisible_by_5() {
    String value = "5";
    String expected = "BarBar";

    String result = stringCompute.compute(value);
    assertThat(result, is(equalTo(expected)));
  }

  @Test
  public void should_add_Qix_if_number_divisible_by_7() {
    String value = "7";
    String expected = "QixQix";

    String result = stringCompute.compute(value);
    assertThat(result, is(equalTo(expected)));
  }

  @Test
  public void should_add_Foo_if_number_contains_3() {
    String value = "33";
    String expected = "FooFooFoo";

    String result = stringCompute.compute(value);
    assertThat(result, is(equalTo(expected)));
  }

  @Test
  public void should_add_Bar_if_number_contains_5() {
    String value = "55";
    String expected = "BarBarBar";

    String result = stringCompute.compute(value);
    assertThat(result, is(equalTo(expected)));
  }

  @Test
  public void should_add_Qix_if_number_contains_7() {
    String value = "77";
    String expected = "QixQixQix";

    String result = stringCompute.compute(value);
    assertThat(result, is(equalTo(expected)));
  }

  @Test
  public void should_replace_0_by_star_symbol() {
    String value = "10101";
    String expected = "FooQix**";
    String value2 = "105";
    String expected2 = "FooBarQix*Bar";

    String result = stringCompute.compute(value);
    assertThat(result, is(equalTo(expected)));

    String result2 = stringCompute.compute(value2);
    assertThat(result2, is(equalTo(expected2)));
  }


}
