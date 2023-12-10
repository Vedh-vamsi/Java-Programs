package merge;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] a=s1.toCharArray();
		char [] b=s2.toCharArray();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					flag=1;
			}
			if(flag==0)
				sum=sum+a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
					flag=1;
			}
			if(flag==0)
				sum=sum+b[i];
		}
		int n=sum;
		while(n>9)
		{
			int p=0;
			while(p!=0)
			{
				p=p+n%10;
				n=n/10;
			}
			n=p;
		}
		System.out.println(n);
		
	}

}
