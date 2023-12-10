package merge;
import java.util.*;
public class BinarySearch
{
	public static void recursive(int[] a,int lb,int ub,int key)
	{int mid=0;
		if(lb<ub)
		{
			mid=(lb+ub)/2;
			if(a[mid]==key)
			{
				System.out.println("Element found at index : "+mid);
				return;
			}
			if(a[mid]<key)
			{
				recursive(a,mid+1,ub,key);
			}
			else
			{
				recursive(a,lb,mid-1,key);
			}
		}
		else
		{
			System.out.println("Element not found!!!");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int key=sc.nextInt();
		recursive(a,0,n,key);
	}
}