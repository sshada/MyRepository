package com.testmaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicTestcase {
	@Test
	public void test() {
		System.out.println("hello-testmethod");
		SampleCode sam = new SampleCode();		
		assertEquals(sam.sample(), "welcome");
		//fail("Not yet implemented");
	}

}
