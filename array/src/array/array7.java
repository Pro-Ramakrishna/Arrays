package array;

public class array7 {

	public static void main(String[] args) {
int[] arr={2,3,4,5,67,69};
int c=arr[0];
arr[0]=arr[arr.length-1];
arr[arr.length-1]=c;
for(int i=0;i<arr.length;i++)
{	
System.out.println(arr[i]);
	}
}
}