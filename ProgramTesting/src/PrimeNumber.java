import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sangar=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sangar.nextInt();
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0) {
				flag=true;
			}
			
		}
		if(flag) {
			System.out.println(num+" is not a prime number");
		}else {
			System.out.println(num+" is a prime number");
		}
		
		
		
		
	}
}