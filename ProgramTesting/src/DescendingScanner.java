import java.util.Scanner;

public class DescendingScanner {

	public static void main(String[] args) {
		Scanner sangar=new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size=sangar.nextInt();
		int[] a=new int[size];
		System.out.println("Enter all numbers");
		for(int i=0;i<size;i++)
		{
			a[i]=sangar.nextInt();
		}
		int temp=0;
		for(int i=0;i<size;i++)
		{
			for (int j =i+1; j < size; j++) {
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.print("Descending order is ");
		for(int i=0;i<size-1;i++)
		{
			System.out.print(a[i]+",");
		}
System.out.print(a[size-1]);
}

}
