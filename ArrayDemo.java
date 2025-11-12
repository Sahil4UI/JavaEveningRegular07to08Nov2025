import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String  - collection of characters
//		String x = "hello";
//		char y [] =x.toCharArray();
//		Array - array is a collection of homogeneous
//		type of data
//		int x[] = {1,2,3,4,5};
//		for (int i=0;i<x.length;i++)
//		System.out.println(x[i]);
//		
		
//		int a[] = new int[10];
		
//		#find the sum of all elements in array
		
//		int x[] = new int[5];
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Elements in Array : ");
//		
//		for (int i=0;i<x.length;i++)
//		{
//			x[i] =sc.nextInt();
//		}
//		
//		for (int i :x)
//		{
//			sum += i;
//		}
//		
//			System.out.println(sum);
		
//		int x[] = {90,100,34,45,23,6};
//		find the largest number from the array
//		int largest = x[0];
//		
//		for (int i=1;i<x.length;i++)
//		{
//			if (x[i]>largest) {
//				largest = x[i];
//			}
//		}
//		System.out.println(largest);
		
//		find the second largest from the array
//		sort the array in ascending order
		
//		int x[] = {90,100,34,45,23,6};
//		
//		for (int i=0;i<x.length-1;i++)
//		{
//			for (int j=i+1;j<x.length;j++) {
//				if (x[i]>x[j])
//				{
//					int temp = x[i];
//					x[i]=x[j];
//					x[j]=temp;
//				}
//			}
//		}
//		2 Dimensional Array
//		transpose
//		int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		int result[][]=new int[3][3];
//		
//		for (int i=0;i<x.length;i++)
//			{
//				for (int j=0;j<x[0].length;j++)
//				{
//					result[i][j] = x[j][i];
//				}
//			}
			
		
//		wap to print upper traingular matrix and lower traingular
//		matrix
		
//		for (int i=0;i<x.length;i++)
//		{
//			for (int j=0;j<x[0].length;j++)
//			{
//				if (2-i==j)
//				System.out.print(x[i][j]+ " ");
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		martrix multiplication in java
		int x [][] = {{1,2},{3,4}};
		int y [][] = {{5,6},{7,8}};	
		int result [] [] =  new int [2][2];
		for (int i=0;i<x.length;i++)
			{
				for (int j=0;j<x[0].length;j++)
				{
					
					for (int k=0;k<x[0].length;k++)
					{
						result[i][j]+=x[i][k]*y[k][j];
					}
				}
			
			}
		
		
		
		
		
	}

}
