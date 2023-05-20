package assignmentweek1.day1;

public class Classstudent {
	public void student(int mark,float cgpa,String name,String clgname) {
		int a=mark;
		float b=cgpa;
		String f=name;
		String g=clgname;
				
		System.out.println("student name is"+" "+f);
		System.out.println("cgpa"+" "+b);
		System.out.println("clg name"+" "+g);
		System.out.println("mark"+" "+a);
		
}
	public static void main(String[] args) {
		Classstudent v=new Classstudent ();
		v.student(750,75.5f,"ram","rvs");
		
	}
		
	}
	
