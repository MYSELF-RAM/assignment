package week3assignment;

import java.util.Arrays;

public class Sortingarray {
	public static void main(String[] args) {
		
	
	//google,Microsoft,testleaf,maverick
	
		String[] name= {"google","microsoft","testleaf","maverick"};
		System.out.println("the total length "+name.length);
		Arrays.sort(name);
		System.out.println("-----sort-----------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			
		}
		System.out.println("-------reverse sort---------");
		for (int i = name.length-1; i >=0 ; i--) {
			System.out.println(name[i]);
			
		}
			
		
		
	
	
	
	
	
	
	

}}
