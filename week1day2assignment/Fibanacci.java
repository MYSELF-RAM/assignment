package week1day2assignment;

public class Fibanacci {

	public static void main(String[] args) {
		int range=8;
		int fn=0;
		int sn=1;
		int sum=0;
		System.out.println(fn);
		System.out.println(sn);
		
		for(int i=3;i<=range;i++) {
			sum=fn+sn;
			fn=sn;
			sn=sum;
			System.out.println(sum);
		}
	}}
        

//0 1 1 2 3 5