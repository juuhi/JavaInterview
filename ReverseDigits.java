package com.java;

public class ReverseDigits 
{
public static int reverseDigits(int num)
{
	int a=0;
	int b=0;
	boolean flag = false;
	if(num<0)
	{
		flag = true;
		num = -num;
	}
	while(num!=0)
	{
		
		a = num %10;//3  //2
		b = b*10 + a;     //321  //30+2
		num = num/10;     //123 --> 12 --1
	}
	return (flag == true)? -b:b;
	
}
public static void main(String[] args) 
{
	System.out.println(reverseDigits(123));
	System.out.println(reverseDigits(-123));
}
}

