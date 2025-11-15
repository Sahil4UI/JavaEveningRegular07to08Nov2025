class Bank{
//	public , private , protected
	private String name = "Kotak Mahindra Bank";
//	private variables can be accessed only inside the same class
	private String ifsc = "KKBK0001";
	protected String ac_no;
	protected int blc;
//	protected variables can be used inside same class or can be used by inheriting the class in which protected
//	variables are defined
	protected String customer;
	
	void init() {
		System.out.println("Welcome Mr"+ this.customer +" to "+name);
		System.out.println("Your account is now active");
		System.out.println("Your available Balance is : "+blc);
	}
}
//inheritence
class SavingAccount extends Bank{
	
	SavingAccount(String customer , int blc, String ac_no){
		this.customer = customer;
		this.blc = blc;
		this.ac_no =ac_no;
	}
	
	void deposit(int amount)
	{
		this.blc += amount;
		System.out.println("Amount of "+amount+" credited to "+ac_no.substring(0,4)+"XXXXXX");
		System.out.println("Your Available Balance is : "+blc);
	}
	
	void withdraw(int amount) {
		
		if (amount > blc)
		{
			System.out.println("Insuffient Balance!!!!");
		}
		else
		{
		this.blc -= amount;
		System.out.println("Amount of "+amount+" withdrawn from "+ac_no.substring(0,4)+"XXXXXX");
		System.out.println("Your Available Balance is : "+blc);
		}
	}
	
	void roi() {
		System.out.println("ROI is 6.7%");
	}
	
}


public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount obj = new SavingAccount("Ravi",10000, "123456867877");
		obj.customer="kajshfsdf";
		obj.init();
		obj.roi();
		obj.deposit(5000);
		obj.withdraw(500000);

	}

}
