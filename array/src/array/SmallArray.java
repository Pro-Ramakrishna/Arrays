package array;

public class SmallArray {

	public static void main(String[] args) {
int [] arr= {2,3,5,8,4,6,1,};
int small=arr[0];
for(int i=1;i<arr.length;i++)
{
	if(arr[i]<small)
	{
		small=arr[i];
	}
}
System.out.println("small:"+small);
}
}
