package week1day2assignment;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=num;     //20
		for(int i=num;i>1;i--) //5,4,3,2,1
		{
			                          
			fact=fact*(i-1);   	//3*3-1  , 6*2-1 , 6*1-1
			}
		System.out.println("the factorial of "+" "+num+" "+"is"+" "+fact);	
	
	
	
	}}
		//5*4*3*2*1