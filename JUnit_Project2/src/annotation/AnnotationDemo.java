package annotation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/* Order of an Annotation is
 * Before => execute for every test block
 * BeforeClass => will execute only once
 * Test (may be any number)
 * After => execute for every test block
 * AfterClass => will execute only once
 */

public class AnnotationDemo {

	static int BeforeCount=1;
	static int BeforeClassCount=1;
	static int AfterCount=1;
	static int AfterClassCount=1;
	
	@Before
	public void setUp()
	
	{
		System.out.println("Execution count for BEFORE method is "+BeforeCount++);
	}
	
	@BeforeClass
	public static void setUpClass() 
	
	{
		System.out.println("Execution count for BEFORE_CLASS method is "+BeforeClassCount++);
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
	
	@Test
	public void test3() 
	
	{
		System.out.println("\t Test 3 block goes here");
	}
	
	@Test
	public void test4() 
	
	{
		System.out.println("\t Test 4 block goes here");
	}
	

	@After
	public void tearDown() 
	
	{
		System.out.println("Execution count for AFTER method is "+AfterCount++);
	}
	
	@AfterClass
	public static void tearDownClass() 
	
	{
		System.out.println("Execution count for AFTER_CLASS method is "+AfterClassCount++);
	}
}
