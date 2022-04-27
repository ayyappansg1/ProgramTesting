public class Armstrongnumber {

	public static void main(String[] args) {

		int num=153;
		int t1=num;
		int count=0;
		while(t1!=0)
		{
			count++;
			t1=t1/10;
		}
		int length=count;
		int arm=0;
		int t2=num;
		while(t2!=0)
		{
			int rem=t2%10;int multi=1;
			for(int i=0;i<length;i++)
			{
				multi=multi*rem;
			}
			arm=arm+multi;
			t2=t2/10;
		}
		System.out.println(arm);
		
		if(num==arm)
		{
			System.out.println("Given number is armstrong number");
		}else {
			System.out.println("Given number is not a armstrong number");
		}
	}
}