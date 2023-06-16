package week4day1assignment;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dupwords {
	public static void main(String[] args) {
		String text="we learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String>s=new LinkedHashSet<String>();
		for (String string : split) {
			s.add(string);
			
			
			
		}
		//System.out.println(s);
		//iterat
		Iterator<String> ite = s.iterator();
		
		while (ite.hasNext()) {
			String next = ite.next();
			System.out.println(next);
			
		}
	
				
		
		
		
		
		
}}
