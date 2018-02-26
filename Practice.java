package com.java;
import java.util.*;

public class Practice 
{
public static void main(String[] args)
{
	String elem = "Notice";
	List<String> myList = new ArrayList<String>();
	myList.add("ABC");
	myList.add("Java");
	myList.add("Notice");
	myList.add("Baby");
	Iterator<String> itr = myList.iterator();
	while(itr.hasNext())
	{
		if(elem.equals(itr.next()))
		{
			itr.remove();
		}
	}
	System.out.println(myList);
	
}
}
