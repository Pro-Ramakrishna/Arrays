package array;

public class Largearray {

	public static void main(String[] args) {
		int [] arr= {1,9,3,10,12,15,7};
		int large=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
System.out.println("large:"+large);
	}

}
