package week3assignment;

import java.util.Arrays;

public class Duplicates {
	public static void main(String[] args) {
		int a[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};{
			Arrays.sort(a);
			{
				for (int i = 0; i < a.length-1; i++) {
					//System.out.println(a[i]);
					if(a[i]==a[i+1]) {
						System.out.println("the dublicate values"+a[i]);
					}
					
				}
			}
			
			
			
			
		}
		
	}

}
