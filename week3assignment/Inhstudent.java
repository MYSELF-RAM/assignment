package week3assignment;



public class Inhstudent  extends Inhdepartment {

	public void studentname() {
		System.out.println("name : RAM");
	}
	public void studentdep() {
		System.out.println("dep : EEE");
	}
	public void studentid() {
		System.out.println("123");
	}
	public static void main(String[] args) {
		Inhstudent details=new Inhstudent ();
		details.collegename();
		details.collegecode();
		details.departmentname();
		details.studentname();
		details.studentdep();
		details.studentid();
		
	}
	
}
