package com.day6;
import java.util.*;

class OnlyAbove18 extends Exception
{
	public OnlyAbove18(String msg)
	{
		super(msg);
	}
	
}

public class MyThrowExceptionAge 
{	
	public static void main(String[] args) throws Exception
	{
	    Scanner s=new Scanner(System.in);
	    
	    int age =s.nextInt();
	    
	    if(age>=18)
	    {
	    	System.out.println("Yes, he/she is above or at the age of 18");
	    }
	    else
	    {
	    	throw new OnlyAbove18("Only Above or equal to the age of 18");	
	    }
	}

}