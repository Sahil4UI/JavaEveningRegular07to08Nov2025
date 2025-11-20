import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo2 {
	
	static void checkAge(int age)
	{
		if (age > 18)
		{
			System.out.println("Proceed for Voter Id Card");
		}
		else {
			throw  new ArithmeticException("Access Denied");
		}
	}
	
	public static void main(String[] args) {
		
			try {
				checkAge(9);
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae.getMessage());
			}
			
		
//		Scanner sc = null;
//		try {	
//					int x,y;
//					sc = new Scanner(System.in);
//					System.out.println("Enter No1 : ");
//					x = sc.nextInt();
//					System.out.println("Enter No2 : ");
//					y = sc.nextInt();
//					
//					System.out.println(x+y);
//					System.out.println(x-y);
//					System.out.println(x*y);
//					System.out.println(x/y);
//					
////					int a [] = {1,2,3,4,5};
////					System.out.println(a[100000]);
//					
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
//		finally {
//			sc.close();
//			System.out.println("Program exited Succussfully......");
//		}
//		
//		catch (ArithmeticException ae) {
//			System.out.println(ae);
//		}
//		catch (InputMismatchException ie)
//		{
//			System.out.println(ie);
//		}
//		catch (ArrayIndexOutOfBoundsException ai) {
//			System.out.println(ai);
//		}

//		Throw
		
		
	}
}
