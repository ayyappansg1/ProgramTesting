public class CountArmstrong {

	public static void main(String[] args) {
		
		int sing=0;
		for(int i=1;i<=1000;i++)
		{
			int t1=i;
			int count1=0;
			while(t1!=0)
			{
				count1++;
				t1=t1/10;			
			}
			int length=count1;
			int t2=i,arm=0;
			while(t2!=0) {
				int multi=1;
				int rem=t2%10;
				for (int j = 1; j <= length; j++) {
					multi=multi*rem;
				}
				arm=arm+multi;
				t2=t2/10;
			}
			if(arm==i) {
				System.out.println(arm);;
			}
		}




	}
}
