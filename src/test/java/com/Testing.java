package com;

import com.Add;
import com.Div;
import com.Multiplication;
import com.Sub;

import junit.framework.TestCase;

public class Testing extends TestCase {
	public void test1() {
		 Add junit=new Add();
		 int result=junit.addition(100, 200);
		 assertEquals(300,result);
	}
	public void test2()
	{
		Sub s=new Sub();
		int result2=s.subtract(500, 100);
		assertEquals(400,result2);
		
	}
	public void test3()
	{
		Multiplication m1=new Multiplication();
		int result3=m1.mul(24, 2);
		assertEquals(48,result3);
	}
	public void test4()
	{
		Div d1=new Div();
		int result4=d1.division(500, 10);
		assertEquals(50,result4);
	}

}

