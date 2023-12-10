package merge;
import java.util.*;
public class Main4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Met(a);
	}
	public static void Met(int[] a)
	{
		int c=0,flag=0;
		for(int i=1;i<a.length-1;i++)
		{
			flag=0;
			if(a[i]==a[i-1]&&a[i]!=a[i+1])
			{
				flag=1;
				c+=1;
			}
		}
		if(a[a.length-1]==a[a.length-2]&&flag==0)
			c+=1;
		System.out.println(c);
	}

}
