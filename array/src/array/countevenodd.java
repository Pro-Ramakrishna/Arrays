package array;

public class countevenodd {

	public static void main(String[] args) {
int[] a={3,7,4,6,9,5,8,2};
	int c1=0;
	int c2=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			c1++;
		}
		else
		c2++;
	}
		System.out.println("Even numbers:"+c1);
		System.out.println("odd numbers:"+c2);
	}
	
	
	
	
	
	
	}
	
	


