package JUnitClasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertExample

{
	
String temp,statement;
int number;

@Before

public void setUp()
{
	number=5;
	temp=null;
	statement="JUnit is working fine";
	System.out.println("Object initialized");
}

@Test

public void test()
{
	//check for equality
	
	assertEquals("JUnit is working fine",statement);
	
	//checking for FALSE condition
	
	assertFalse(number>6);
	
	//check for not NULL 
	
	assertNotNull(statement);
	
	//check for NULL
	
	assertNull(temp);
	
	//check for true condition
	
	assertTrue(number==5);
}

@After

public void tearDown() 
{
	System.out.println("Object destroyed");
}
}
