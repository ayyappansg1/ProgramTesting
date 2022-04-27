import java.util.Scanner;

public class PRintingTable {

	public static void main(String[] args) {
		Scanner sangar=new Scanner(System.in);
		System.out.println("Enter Which table want to print");
		int element=sangar.nextInt();
		System.out.println("Upto which number want ");
		int upto=sangar.nextInt();
		for(int i=1;i<=upto;i++)
		{
			int multi=i*element;
			System.out.println(i+"*"+element+"="+multi);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
