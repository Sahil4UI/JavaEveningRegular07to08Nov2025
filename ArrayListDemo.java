import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		array - static
//		int x[] = new int [100];
//		x[101]=4;
		
//		Array List
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(100);
		obj.add(500);
		obj.add(1000);
		
//		System.out.println(obj);
//		obj.remove(0);
//		obj.set(0, 99);
		System.out.println(obj);
		
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(10);
		obj1.addAll(obj);
//		obj1.clear();
//		System.out.println(obj1);
		obj1.forEach((n)->{System.out.println(n);});
//		functions
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.indexOf(500));
		System.out.println(obj1.lastIndexOf(500));
		System.out.println(obj1.size());

	}

}
