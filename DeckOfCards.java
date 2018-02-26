package com.java;
import java.util.Arrays;
import java.util.Random;


public class DeckOfCards {

		public static String deck = "23456789TJQKA";  //T - ten
		//static int numOfShuffles = 13;
		public static void main(String[] args) 
		{
			char[] d = new char[13];
			d = deck.toCharArray();	
			
			Random rand = new Random();
			int n = 13, randnum;

			for(int i = 0; i < deck.length(); i++) //o(n)
			{
				randnum = rand.nextInt(n);
				char temp = d[0];     // temp --> 2
				d[0] = d[randnum];    //d[0] --> random
				d[randnum] = temp;    //d[random] --> 2
			}
			System.out.println(Arrays.toString(d));
		}
	}