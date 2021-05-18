package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitString_Test {

	@Test
	public void test() 
	{
		MainCode m=new MainCode();
		String output=m.Combine("Hi ","All");
		assertEquals("Hi All",output);
	}

}
