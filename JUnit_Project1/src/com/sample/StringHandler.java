package com.sample;

public class StringHandler 

{
	// First method ========================================
	
public boolean StringCompare(String first,String second)
{
	if(first.equalsIgnoreCase(second))
	{
		return true;
	}
	return false;
}
  
  // Second method =========================================

public String StringConcat(String first,String second)
{
	return first.concat(second);
}


 
  // Third method ============================================

public int[]array (int[] numbers)
{
	int length=numbers.length;
	int output[]=new int[length];
	for(int i=0;i<length;i++)
	{
		output[i]=numbers[i]+1;
	}
	return output;
	
}

  // Fourth method ==========================================

public void performance()
{
	for(int i=0;i<=10000;i++)  // to increase the time out change the zeroes
	{
		
	}
	System.out.println("Finish");
	
}

 // Fifth method ===========================================

public void exception(int number)
{
	int result=10/number;
	System.out.println("Result is "+result);
	
}

}