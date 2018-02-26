package com.java;

import java.util.HashSet;
import java.util.Set;

public class Reverse 
{
//		  public static int numJewelsInStones(String J, String S) {
//		    int[] f = new int[128];
//		    for (final char c : J.toCharArray()) //{a,A}
//		    f[c] = 1;
//		    int ans = 0;
//		    for (final char c : S.toCharArray())  //a --> a, A , a, b   A --> a , A , a , b
//		      ans += f[c];  // 1
//		    return ans;
//		  }
//public static void main(String args[])
//{
//	System.out.println(numJewelsInStones("aA","aAabBCD"));
//}
//}

	 public static int singleNumber(int nums[])
	 {
		 HashSet<Integer> myset = new HashSet<Integer>();
//	        """
//	        :type nums: List[int]
//	        :rtype: int
//	        """
	        return 2 * sum(myset) - Math.signum(nums);
	 }

	private static int sum(HashSet<Integer> myset) {
		for (Integer i:nums) {
			return i = +i;
		}
	}
}