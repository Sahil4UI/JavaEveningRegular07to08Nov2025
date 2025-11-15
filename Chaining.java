class A{
	int a,b,c,d;
	
	A(){
		System.out.println("Default constructor");
	}
	
	A(int a, int b){
		this();
		this.a=a;
		this.b=b;
		System.out.println("2nd constructor called");
	}
	
	A(int a,int b,int c){
		this(a,b);
		this.c=c;
		System.out.println("3rd constructor called");
	}
	
	
	A(int a,int b,int c,int d){
//		this is also used to call one constructor inside another constructor
//		this must be used in the fist line
		this(a,b,c);
		this.d = d;
		System.out.println("4th constructor called");
	}
}
public class Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A(1,2,3,4);

	}

}
