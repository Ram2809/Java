package com.practice.study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class OverloadingDemoTest1 {

	OverloadingDemo od1;

	@BeforeEach
	void setUp() throws Exception {
		od1=new OverloadingDemo();
	}

	@AfterEach
	void tearDown() throws Exception {
		od1=null;
	}

	@Test
	void test() {
		assertEquals(10,od1.add(1,2,3,4));
		//fail("Not yet implemented");
	}
	@ParameterizedTest
	@ValueSource(ints={1,3,5,7})
	void testisOdd(int n)
	{
		assertTrue(Odd.isOdd(n));
	}
	@ParameterizedTest
	@ValueSource(ints={3,1,2},{5,2,3})
	void testadd(int a,int b)
	{
		assertEquals()
	}
}
