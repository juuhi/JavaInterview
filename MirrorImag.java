package com.java;
import java.util.*;

public class MirrorImag 
{
 public static StringBuffer getImage(String str)
 {
	 
	 StringBuffer sb = new StringBuffer(str); //StringBuffer is slow as it is thread safe
	                                          //but the process is slow then StringBuilder.
	 return sb.reverse();
 }
 public static void main(String[] args) 
 {
	System.out.println("Main Method");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.nextLine();
	System.out.println("Output is " + str+"|"+getImage(str) );
	System.out.println("Main Method Ends");
}
}
