package week3assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="stops";
		String text2="potss";
		int t1 = text1.length();
		int t2 =text2.length();
		if(t1!=t2) {
			System.out.println("word not anagram");
			
		}
		else {
		char[] ch1 = text1.toCharArray();
		char[] ch2 = text2.toCharArray();
		{
			Arrays.sort(ch1);
			System.out.println(ch1);
			Arrays.sort(ch2);
			System.out.println(ch2);
			boolean equals = Arrays.equals(ch1, ch2);
			System.out.println("the given word is anagram  "+equals);
			
		}
			
		}
		
	}

}
