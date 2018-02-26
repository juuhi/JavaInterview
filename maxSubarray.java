package com.java;
import java.util.*;

public class maxSubarray 
{
	public static int maxSubarray(int[] a, int size)
	{
		 int maxVal = a[0];
		 int curr_max = a[0];
		 for (int i =0; i<size; i++)
		 {
			 curr_max = Math.max(a[i],curr_max+a[i]);
			 maxVal = Math.max(maxVal, curr_max);
			 
		 }
		 return maxVal;
	}
public static void main(String[] args) 
{
	int a[] = {-2,-3,4,-1,-2, 1,5,-3};
	int n = a.length;
	System.out.println(maxSubarray(a, n));
}
}
