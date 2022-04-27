
public class Binary {
	public int binarysearch(int[] inputarray,int key) {
	int start=0;
	int end=inputarray.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(key==inputarray[mid]) {
				return mid;
			}
			if(key<inputarray[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}		
	public static void main(String[] args) {

		Binary sangar=new Binary();
		int[] arr= {2,4,6,8,10,12,14,16};
		System.out.println("Key 14th Position is "+sangar.binarysearch(arr, 14));





	}

}