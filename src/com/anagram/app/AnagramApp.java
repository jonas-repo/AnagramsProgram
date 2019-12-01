package com.anagram.app;

public class AnagramApp {

	public static void main(String[] args) {
		
		//objects initialization
		String word1 = "roma";
		String word2 = "amor";
		String noAnagram ="loco";
		String noAnagram2 = "coco";
		
		//compare sums of the words
		if(charSum(word1) == charSum(word2))
		{
			System.out.println(word1 +" and "+word2+" are anagrams");
			System.out.println("The sum of characters from "+word1+" is: "+charSum(word1));
			System.out.println("The sum of characters from "+word2+" is: "+ charSum(word2));
		}
		if(charSum(noAnagram) == charSum(noAnagram2))
		{
			System.out.println("Son anagramas");
		}
		System.out.println("The sum of characters from "+noAnagram+" is: "+charSum(noAnagram));
		System.out.println("The sum of characters from "+noAnagram2+" is: "+ charSum(noAnagram2));
		
		
		

	}
	
	public static int charSum(String word)
	{
		char[] array = word.toCharArray();
		int sum = 0;
		
		//if you equals a integer to char the integer number will be the number of char
		//so you can sum chars 
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;

	}
	

}
