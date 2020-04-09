package com.sapient.week1;

public class CheckEven
{
	public static void main(String[] args)
	{
		System.out.println(check(9));		
	}
	public static Boolean check( int n)
	{
		if (n%2 == 0) return true;
		else return false;
	}
}