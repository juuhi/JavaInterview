//Create a class with a method to find the difference between the sum of the squares and the 
//square of the sum of the first n natural numbers.
package com.java;
import java.util.*;

public class Difference_between_squaresum_sumsquare 
{
 public static int sum(int n)
 {
	 int square = 0;
	 int sum =0;
	 for (int i =0; i<=n; i++)
	 {
	   //square = (int)(square + Math.pow(i, 2));
	   square = square + i*i;
	   sum = sum + i;
	 }
	return Math.subtractExact(square, (int) Math.pow(sum, 2));
 }
public static void main(String[] args) 
{
	System.out.println("Main Start");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	System.out.println("Output is " +sum(n));
	System.out.println("Main Ends");
}
}
