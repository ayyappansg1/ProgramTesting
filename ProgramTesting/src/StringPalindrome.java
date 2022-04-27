import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sangar=new Scanner(System.in);
		String given=sangar.next();
		String count="";
		for(int i=given.length()-1;i>=0;i--)
		{
			count=count+given.charAt(i);
		}
		System.out.println(count);
		if(given.equals(count))
		{
			System.out.println("given String is Palindrome");
		}else {
			System.out.println("given string is not a palindrome");
		}
	
		
		

}
}
