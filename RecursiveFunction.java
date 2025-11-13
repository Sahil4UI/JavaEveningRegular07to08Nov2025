
public class RecursiveFunction {
//	when a function is called again and again , that function is called
//	recursive function
	
//	static void f1(int x) {
//	base case
//		if (x>5) {
//			return;//no more function calling
//		}
//		
//		f1(x+1);
//		System.out.println(x);
//	}
//	
//	WAP to find the length of String using recursion
//	WAP to print nth fibonacci number
	
//	static int fib(int n) {
//		if (n==0 || n==1)
//		{
//			return n;
//		}
//		return fib(n-1)+fib(n-2);
//	}
//	
	static int len(String a) {
		if (a=="")
		{
			return 0;
		}
		
		return 1+ len(a.substring(1));
	}
	
	
	
	
//	find the power of number using recursive function
//	
	
	public static void main(String[] args) {
//		int result = fib(6);
//		System.out.println(result);
		int result = len("Hello");
		System.out.println(result);
		
	}
}
