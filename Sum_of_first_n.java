//Create a class with a method 
//which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

package com.java;

import java.util.Scanner;

public class Sum_of_first_n 
{
  public static int sum_of_first(int n)
  {
	  int sum = 0;
	  for (int i=0; i <=n ; i++)
	  {
		  if (i%3==0 || i%5==0)
		  {
			  sum = sum + i;
		  }
	  }
		  return sum;
  }
  public static void main(String[] args) 
  {
	System.out.println("Main method Begins");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	System.out.println("Sum of first n numbers divisible by 3 or 5 is " + sum_of_first(n));
	System.out.println("Main method ends");
  }
}
