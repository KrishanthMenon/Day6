package com.day6;

import java.io.File;
import java.io.FileInputStream;


public class MyCatchException {
	
	public static void main(String args[])
	{
		try
			{
				
				FileInputStream inputStream=new FileInputStream("C:\\Program Files\\eclipse-java-2021-12-R-win32-x86_64\\file.txt");
				int a[]=new int[5];
				System.out.println("Guten Tag!");
				String str=" Deutsch";
				System.out.println(str.substring(10));
				System.out.println("Lernen");
			}
		
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
