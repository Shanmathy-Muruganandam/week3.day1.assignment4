package week3.day1.classassignments;

public class Students {
	public static void studentInfo(int id) {
		System.out.println("Student ID: \t"+id);
	}
	public void studentInfo(int id, String name) {
		System.out.println("Student ID: \t"+id);
		System.out.println("Student Name: \t"+name);
	}
	public void studentInfo(String email,long phNo) {
		System.out.println("Student Email ID: \t"+email);
		System.out.println("Student Phone Number: \t"+phNo);
	}
	public static void main(String[] args) {
		Students std = new Students();
		Students.studentInfo(12);
		std.studentInfo(12, "Baalaajee");
		std.studentInfo("DuraiVenkgades@gmail.com", 9626448682L);
	}

}
