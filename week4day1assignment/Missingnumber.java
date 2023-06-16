package week4day1assignment;

import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
		int[]num= {1,2,3,4,5,6,7,8,10};  
		                             
		int n = num.length+1;
		int sums=(n*(n+1))/2;       //55
		int a=Arrays.stream(num).sum();//46
		int miss=sums-a;
		System.out.println("missing number is: "+miss);
		
		
		
		
		
		
		
		

	}

}


