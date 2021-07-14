package com.practice.study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OverloadingDemoTest {
	OverloadingDemo od;
	@BeforeEach
	void setUp() throws Exception {//LIFE CYCLE OF JUINT TEXE CASE
		od=new OverloadingDemo();
	}

	@AfterEach
	void tearDown() throws Exception {//LIFE CYCLE OF JUINT TEXE CASE
		od=null;
	}

	@Test//JUNIT ANNOTATIONS
	void testAddIntInt() {//TEST LOGIC
		assertEquals(9,od.add(4,5));//ASSERT METHOD, HERE 9 ->EXPECTED OUTPUT AND od.add(4,5)->Actual output
		//fail("Not yet implemented");
	}

	@Test
	void testAddIntIntInt() {
		assertNotEquals(7,od.add(1, 2,3));
		//fail("Not yet implemented");
	}

	@Test
	void testAddFloatInt() {
		assertEquals(11.2,od.add(1.2,10));
		//fail("Not yet implemented");//default assert method
	}

	@Test
	void testAddDoubleDouble() {
		assertEquals(2.4,od.add(1.2,1.2));
		//fail("Not yet implemented");
	}

}
