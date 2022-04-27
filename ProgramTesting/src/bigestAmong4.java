import java.util.Scanner;

public class bigestAmong4 {

	public static void main(String[] args) {
		Scanner sangar=new Scanner(System.in);
		System.out.println("Enter first Value");
		int a=sangar.nextInt();
		System.out.println("Enter second Value");
		int b=sangar.nextInt();
		System.out.println("Enter third Value");
		int c=sangar.nextInt();
		System.out.println("Enter fourth Value");
		int d=sangar.nextInt();
		
		if(a>b&&a>c&&a>d)
		{
			System.out.println(" a value is biggest");
		}else if(b>a&&b>c&&b>d) {
			System.out.println("b value is biggest");
		}else if(c>a&&c>b&&c>d) {
			System.out.println("c value is biggest");
		}else {
			System.out.println("d value is biggest");
		}
	}
}
