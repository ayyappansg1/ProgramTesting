import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] number= {25,16,22,7,15,31};
		int temp=0;
		for(int i=0;i<number.length;i++)
		{
			for (int j =i+1; j < number.length; j++) {
				if(number[i]<number[j])
				{
					temp=number[j];
					number[j]=number[i];
					number[i]=temp;
				}
			}
		}
		for(int i=number.length-1;i>0;i--)
		{
			System.out.print(number[i]+",");
		}
System.out.println(number[0]);
}

}
