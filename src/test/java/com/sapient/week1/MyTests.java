package com.sapient.week1;

import static org.junit.jupiter.api.Assertions.assetEquals;

import org.junit.jupiter.api.Test;

public class MyTests
{
	@Test
	public void FirstTest()
	{
		CheckEven tester = new CheckEven();

		assertEquals( true, check(8));
		assertEquals( true, check(12));
		assertEquals( false, check(3));
		assertEquals( false, check(5));
	}
}