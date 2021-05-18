import static org.junit.Assert.*;

import com.sample.StringHandler;

public class Test {

	@org.junit.Test
	
	
	public void test_compare()
	
	{
		StringHandler str=new StringHandler();
		//========================= Assert true and false for I method =======================
		assertTrue("The test success", str.StringCompare("hello", "hello"));
		assertFalse("The test fails", str.StringCompare("helo", "hello"));
		
	}

	
	//======================= second method ===========================
	
@org.junit.Test
	
	
	public void test_Concat()
	
	{
     	StringHandler str=new StringHandler();
	    assertEquals("Hello World",str.StringConcat("Hello"," World")); // assertEquals
	    assertNotEquals("HI ALL",str.StringConcat("Hi","ALL"));
	}


    //======================= third method array equal ======================

@org.junit.Test


public void test_array()

{
 	StringHandler str=new StringHandler();
    int[] expected=new int[] {3,8,4};
    assertArrayEquals(expected, str.array(new int[] {2,7,3}));
}

    //======================== Performance Testing =====================

@org.junit.Test(timeout=3)  


public void test_Performance()

{
 	StringHandler str=new StringHandler();
    str.performance();
}

    //====================== Exception handling ========================

@org.junit.Test (expected=ArithmeticException.class)


public void exception_Handling()

{
 	StringHandler str=new StringHandler();
    str.exception(1);
}
}
