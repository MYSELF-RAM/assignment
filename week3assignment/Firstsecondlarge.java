package week3assignment;

import java.util.Arrays;

public class Firstsecondlarge {
	public static void main(String[] args) {
		
		int[]data= {3,2,11,4,6,7};
		{
			Arrays.sort(data);
			for (int i = 0; i < data.length; i++) {
				//System.out.println(data[i]);//2,3,4,6,7,11
				
				
			}
			System.out.println("---------last-------");
			int l= data.length;
			//System.out.println(l);
			System.out.println("the second last num  "+data[l-2]);
			
			
		}
		
	}

}
