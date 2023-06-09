package week3assignment;

public class Studentinfo {
	public void getstudentinfo(int id,String name) {
		
		System.out.println("name:"+name);
		System.out.println("id num:"+id);
	}
	
	public void getstudentinfo(String gmail,int phno) {
	
	System.out.println("email:"+gmail);
	System.out.println("phno:"+phno);
	}
	public void getstudentinfo(String org) {
		System.out.println("org:"+org);
		
	}
	public static void main(String[] args) {
		
		Studentinfo info=new Studentinfo();
		info.getstudentinfo(03, "Ram");
		info.getstudentinfo("ram1397", 245654);
		info.getstudentinfo("Testleaf");
		
	}
		
	}


