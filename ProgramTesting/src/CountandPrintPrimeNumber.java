import java.util.Scanner;

public class CountandPrintPrimeNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			
			int num=i;
			boolean flag=false;

			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0) {
					flag=true;
				}

			}
			if(!flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}
