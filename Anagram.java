package com.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram 
{
public static boolean isAnagram(String s, String t)
{
	if (s.length() != t.length())
			{
		       return false;
			}
	char[] str1 = s.toCharArray();
	char[] str2 = t.toCharArray();
	Arrays.sort(str1);
	Arrays.sort(str2);
	return Arrays.equals(str1, str2);
}
public static void main(String[] args) {
	String s ="Name";
	String t = "ameN";
	System.out.println("Are Strings Anagram -->" +isAnagram(s,t));
}
}
