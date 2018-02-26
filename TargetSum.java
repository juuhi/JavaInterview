package com.java;
import java.util.*;

public class TargetSum 
{
public static int[] targetSum(int[] nums, int target)
{
	Map<Integer,Integer> map = new HashMap<>();
	for (int i =0; i<nums.length; i++)
	{
		int a = target - nums[i];   //3-1 = 2
		if (map.containsKey(a))
		{
			return new int[] {map.get(a),i}; //
		}
		map.put(nums[i],i);
	}
	throw new IllegalArgumentException("No Sum Found");
	
}
public static void main(String[] args) 
{
	int nums[] = {1,2,3,4};
	int[] output  = targetSum(nums, 5);
	for (int i = 0; i<output.length; i++)
	{
		System.out.println("Output" +output[i]);
	}
}
}
