package com.java;

import java.util.StringTokenizer;

public class RemoveArbitrarySpaces 
{
	public static void main(String[] args) {
		String str = "The main   method    has no value";
		StringTokenizer st = new StringTokenizer(str);
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreElements())
		{
			sb.append(st.nextToken()).append(" ");
		}
	System.out.println("The new sentence without the arbitrary spaces is :-> " + sb);
	}
}