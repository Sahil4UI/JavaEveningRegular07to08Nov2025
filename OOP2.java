
class Students1{
//	
//	properties
	private int roll;
//	instance variables
	private String name;
	private int std;

	Students1(int r,String n, int s) {
		roll =r;
		name = n;
		std = s;
	}
	
	
//	setter and getter
	
	
	
	void setName(String name) {
		this.name = name;
	}
	
	void setStd(int std) {
		if (std>0 && std<=12)
		this.std = std;
		else {
			System.out.println("Invalid Class");
		}
	}
	
	
	
	void showDetails() {
		System.out.println("Your Roll is : "+roll);
		System.out.println("Your Name is : "+name);
		System.out.println("Your Class is : "+std);
		System.out.println("**************");
	}
}

public class OOP2 {

	public static void main(String[] args) {
//		Students s = new Students();
//		s.showDetails();
		
		// TODO Auto-generated method stub
		
		Students1 s = new Students1(101,"Vanshika",10);
		
		s.showDetails();
		
	
		
//		DRY -Dont repeat Yourself
		
		
		Students1 s1 = new Students1(102,"Vansh",10);
		s1.setName("Amit");
		s1.setStd(-10);
		s1.showDetails();
		
	}

}
