package array;
import java.util.Scanner;
public class Arrayconstruct {

	public static void main(String[] args) {
    System.out.println("enter arry size:");
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the elements");
    for(int i=1;i<n;i++)
    {
    	arr[i]=scan.nextInt();
    }
    System.out.println("the elements are");
    for(int a:arr)
    {
    	System.out.println(a);
    }
	}

}
