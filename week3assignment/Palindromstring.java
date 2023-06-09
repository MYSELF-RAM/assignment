package week3assignment;



public class Palindromstring {
	public static void main(String[] args) {
		String name="madam";
		char[] c= name.toCharArray();
		//System.out.println(c);
		
		for (int i = 0; i < c.length; i++) {
			//System.out.println(c[i]);
			for (int j = c.length-1; j >=0 ; j--) {
			//	System.out.println(c[j]);
				if(c[i]==c[j]) {
				      System.out.println("palindrom");
				      break;
				}
				
				
			}
			
		}
		
		
		
		
		
		}
			
			
		
		
		
		
		
		
	}


