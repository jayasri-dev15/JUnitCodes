package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitAddition_Test 

{

	@Test
	public void test() 
	{
		MainCode m=new MainCode();
		int output=m.addition(10, 20);
		assertEquals(30,output);
	}

}
