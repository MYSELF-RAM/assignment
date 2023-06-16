package week4day1assignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removedup {
	public static void main(String[] args) {
		
		
		String name="paypal india";
		char[] ch = name.toCharArray();
		Set<Character>s=new LinkedHashSet<Character>();
		Set<Character>u=new LinkedHashSet<Character>();
		for (Character character : ch) {
			if(!u.add(character)) {
				s.add(character);
			}
			}
		System.out.println("dup word"+s);
		for (Iterator iterator = u.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			System.out.print(character);
			
		}
		
		
		
		
	}

}
