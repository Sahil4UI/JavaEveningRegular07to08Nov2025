
class Students{
//	properties
	int roll;
	String name;
	int std;
//	initializer
	Students(){
		System.out.println("default");
	}
	Students(int r,String n, int s) {
		roll =r;
		name = n;
		std = s;
	}
	
	void showDetails() {
		System.out.println("Your Roll is : "+roll);
		System.out.println("Your Name is : "+name);
		System.out.println("Your Class is : "+std);
		System.out.println("**************");
	}
}

public class OOP1 {

	public static void main(String[] args) {
//		Students s = new Students();
//		s.showDetails();
		
		// TODO Auto-generated method stub
		
		Students s = new Students(101,"Vanshika",10);
		s.showDetails();
		
//		DRY -Dont repeat Yourself
		
		
		Students s1 = new Students(102,"Vansh",10);
		
		s1.showDetails();
		
	}

}
