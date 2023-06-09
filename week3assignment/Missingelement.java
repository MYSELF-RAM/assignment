package week3assignment;

import java.util.Arrays;

public class Missingelement {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,7,6,8};
			Arrays.sort(a);//7
			int missingvalue=-1;
			for (int i = 0; i < a.length; i++) {
				//System.out.println(a[i]);
				//System.out.println(a[i+1]);
				if(a[i+1]-a[i]>1) {
					missingvalue=a[i]+1;
					break;
				}
				
			}
			System.out.println(missingvalue);
			}}