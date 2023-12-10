package merge;
import java.util.*;
public class MergeSort
{
	public static void merge(int []a,int l,int mid,int r)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		int L[]=new int[n1];
		int M[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=a[l+i];
		for(int j=0;j<n2;j++)
			M[j]=a[mid+j+1];
		int i=0,j=0,k=l;
		while(i<n1&&j<n2)
		{
			if(L[i]<=M[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=M[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k++]=L[i++];
		}
		while(j<n2)
		{
			a[k++]=M[j++];
		}
		printSolution(a);
		
	}
	public static void printSolution(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void sort(int a[], int l,int r)
	{
		if(l<r)
		{
			int mid=(l+(r-1))/2;
			sort(a,l,mid);
			sort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sort(a,0,n-1);
	}
}