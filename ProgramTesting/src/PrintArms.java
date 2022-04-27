public class PrintArms{

	public static void main(String[] args) {

		
		for(int i=1;i<=1000;i++)
		{
			int count=0;
			int t1=i;
			while(t1!=0)
			{
				count++;
				t1=t1/10;
			}
			int length=count;
			int arm=0;
			int t2=i;
			while(t2!=0)
			{
				int rem=t2%10;int multi=1;
				for(int j=1;j<=length;j++)
				{
					multi=multi*rem;
				}
				arm=arm+multi;
				t2=t2/10;
			}
			if(i==arm)
			{
				System.out.println(i);
			}
		}
	}




}
