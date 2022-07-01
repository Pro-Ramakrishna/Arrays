package array;

public class SwapFirstevenlastodd {

	public static void main(String[] args) {
int [] arr= {1,2,1,7,4,2,0,9,6};
int temp1=0,temp2=0,temp3=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]%2==0) {
		temp1=i;
		System.out.println("first even number"+arr[i]);
		break;
	}
}
System.out.println(" ");
for(int i=arr.length-1;i>0;i--)
{
	if(arr[i]%2 !=0)
	{
		temp2=i;
		System.out.println("last odd number"+arr[i]);
		break;
	}
}
temp3=arr[temp1];
arr[temp1]=arr[temp2];
arr[temp2]=temp3;
System.out.println("after swap:");
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]+" ");
}
	}

}
