package week3assignment;


public class Oddindexuppercase {
	public static void main(String[] args) {
		String name="changeme";
		char[] ch = name.toCharArray();
		//System.out.println(ch);
		
		//System.out.println(name);
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0) {
				ch[i]=Character.toUpperCase(ch[i]);
				System.out.println(ch[i]);
				
			}
			else {
				
				System.out.println(ch[i]);
			}
		}
		
		
		
		
		
		
		
	}

}
