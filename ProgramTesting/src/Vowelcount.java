import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		String name="Welcome";
		name=name.toLowerCase();
		int vowel=0,nonvowel=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'||
					name.charAt(i)=='o'||name.charAt(i)=='u') {
			vowel++;
			}
			else {
				nonvowel++;
			}
		}
		System.out.println("Vowel Count is "+vowel);
		System.out.println("Non vowel count is "+nonvowel);
	}
}
