import java.util.Scanner;

public class PrintCountSmallCapsNumberSpecial {

	public static void main(String[] args) {
		
		String input="Hi Welcome To Java Class Tomorrow at 2.00p.m!!";
		int smallcount=0,capscount=0,numbercount=0,specialcount=0;
		for(int i=0;i<input.length();i++)
		{
		if(input.charAt(i)>='a'&& input.charAt(i)<='z')
		{
			smallcount++;
		}else if(input.charAt(i)>='A'&& input.charAt(i)<='Z')
		{
			capscount++;
		}else if(input.charAt(i)>='0'&& input.charAt(i)<='9')
		{
			numbercount++;
		}else {
			specialcount++;
		}
		}
		System.out.println("Numbers of Small Letters "+smallcount);
		System.out.println("Numbers of Capital Letters "+capscount);
		System.out.println("Numbers of Number "+numbercount);
		System.out.println("Numbers of Special characters "+specialcount);

		
		
		
		
		

}
}
