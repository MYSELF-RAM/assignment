package week1day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int n=num;
		int rev=0;
		int bal=0;
			
			for(;num>0;) 
				{
				bal=num%10;                 //1                
				rev=rev*10+bal;              //1               
				num=num/10;
				
				}
			
			 if (n==rev) {
			System.out.println(rev+" "+"is a palindrome number");
			}
			 else {
				 System.out.println(n+" "+" is not palindrome number");
	}

			}}


//121   121

//121/10=12.1   1                  
//12/10= 1.2    2
//1/10 ==0.1    1