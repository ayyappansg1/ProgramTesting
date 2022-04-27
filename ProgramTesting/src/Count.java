import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		Scanner sangar=new Scanner(System.in);
		int given=sangar.nextInt();
		int count=0,sang=0;
		while(given!=0)
		{
			int rem=given%10;
			count=count+rem;
			sang++;
			given=given/10;
		}
		System.out.println(sang);
		
		

}
}
