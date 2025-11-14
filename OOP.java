
class Student{
//	properties
	int roll;
	String name;
	int std;
}

public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.roll = 101;
		s.name = "Vanishika";
		s.std = 10;
		
//		DRY -Dont repeat Yourself
		System.out.println(s.roll);
		System.out.println(s.name);
		System.out.println(s.std);
		
		Student s1 = new Student();
		s1.roll = 102;
		s1.name = "Amit";
		s1.std = 10;
		System.out.println("******************8");
		
//		DRY -Dont repeat Yourself
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.std);
	}

}
