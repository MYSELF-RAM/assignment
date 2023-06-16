package week4day1assignment;

import java.util.HashSet;
import java.util.Set;

public class Uniquechar {

	public static void main(String[] args) {
		String name="babu";
		char[] ch= name.toCharArray();  //b,a,b,u
		Set<Character>dup=new HashSet<Character>();  //a,b,u
		Set<Character>uni=new HashSet<Character>();  //b
		
		for (Character character : ch) {   
			if(!dup.add(character)){
				uni.add(character);
			}
			
			
		}
		dup.removeAll(uni);
		System.out.println(dup);
		
		
		
		
		
	}

}
