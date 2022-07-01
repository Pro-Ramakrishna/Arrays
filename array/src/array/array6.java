package array;

public class array6 {

	public static void main(String[] args) {
int[] a= {2,4,3,9,7,2,6};
if(a[a.length-1]%2==0 && a[0]%2==0)
{
	System.out.println(a[0]*a[a.length-1]);
}
else 
	System.out.println("Not even numnbers");
	}	
}