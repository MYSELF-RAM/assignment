package assignmentweek1.day1;

public class specification {
	public void mobile(int cost,float weight,boolean charge,String name) {
	int a=cost;
	float b=weight;
	boolean e=charge;
	String f=name;
	System.out.println("mobile name is"+" "+f);
	System.out.println("mobile weight in gms"+" "+b);
	System.out.println("mobile fully charged"+" "+e);
	System.out.println("mobile cost is"+" "+a);
	}
	public static void main(String[] args) {
		specification c=new specification();
		c.mobile(22000,180.50f,true,"vivo");
		
		
	}
}
