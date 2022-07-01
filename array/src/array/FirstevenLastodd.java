package array;

public class FirstevenLastodd {

	public static void main(String[] args) {
int []arr= {1,2,1,7,4,2,0,9,6};
for(int i=0;i<arr.length;i++)	
{
if(arr[i]%2==0)
{
	System.out.println("first even number:"+arr[i]);
	break;
}
System.out.println(" ");

for(i=arr.length-1;i>0;i--)
{
	if(arr[i]%2 !=0)
	{
		System.out.println("last odd number:"+arr[i]);
		break;
	}
}
}
	}
}
