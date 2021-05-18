package fixtures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/* setUp() and TearDown() are JUnit fixtures*/

public class FixturesDemo {

	@Before
	public void setUp() //invocation of test
	
	{
		System.out.println("Execution count for BEFORE method");
	}
	
	@BeforeClass
	public static void setUpClass() 
	
	{
		System.out.println("Execution count for BEFORE_CLASS method");
	}

	@Test
	public void test1() 
	
	{
		System.out.println("\t Test 1 block goes here");
	}
	
	@Test
	public void test2() 
	
	{
		System.out.println("\t Test 2 block goes here");
	}
	
	
	@After
	public void tearDown()  // completion of test
	
	{
		System.out.println("Execution count for AFTER method");
	}
	
	@AfterClass
	public static void tearDownClass() 
	
	{
		System.out.println("Execution count for AFTER_CLASS method");
	}
}
