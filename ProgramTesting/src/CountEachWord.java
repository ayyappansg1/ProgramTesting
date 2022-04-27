import java.util.HashMap;
import java.util.Scanner;

public class CountEachWord {

	public static void main(String[] args) {
		String s="Vengat ram ram Vengat sangar ram";
		String[] word=s.split(" ");	
		System.out.println(word[0]+" "+word[1]+" "+word[2]+" "+word[3]+" "+word[4]+" "+word[5]);
		HashMap<String,Integer> sangar=new HashMap<String,Integer>();
		for (String c : word) {
			if(sangar.containsKey(c))
			{
				int x=sangar.get(c);
				sangar.put(c, x+1);
			}else {
				sangar.put(c, 1);
			}
		}
		System.out.println(sangar);	
	}
}
