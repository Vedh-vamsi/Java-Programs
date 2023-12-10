package merge;
import java.util.*;
public class KnapSack
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of objects : ");
	int ob=sc.nextInt();
	int[] w=new int[ob];
	int[] p=new int[ob];
	for(int i=0;i<ob;i++)
	{
		System.out.println("Enter weight : ");
		w[i]=sc.nextInt();
		System.out.println("Enter profit : ");
		p[i]=sc.nextInt();
	}
	double pw[]=new double[ob];
	for(int i=0;i<ob;i++)
		pw[i]=(double)p[i]/(double)w[i];
	for(int i=0;i<ob;i++)
	{
		for(int j=i+1;j<ob;j++)
		{
			if(pw[i]<pw[j])
			{
				int temp=p[i];
				p[i]=p[j];
				p[j]=temp;
				temp=w[i];
				w[i]=w[j];
				double temp1=pw[i];
				pw[i]=pw[j];
				pw[j]=temp1;
			}
		}
	}
	System.out.println("Objects : ");
	for(int i=1;i<=ob;i++)
		System.out.print(i+" ");
	System.out.println();
	System.out.print("Profit    : ");
	for(int i=0;i<ob;i++)
		System.out.print(p[i]+" ");
	System.out.println();
	System.out.print("Weight    : ");
	for(int i=0;i<ob;i++)
		System.out.print(w[i]+" ");
	System.out.println();
	System.out.print("p/w ratio : ");
	for(int i=0;i<ob;i++)
		System.out.print(pw[i]+" ");
	System.out.println();
	System.out.println("Enter capacity : ");
	int m=sc.nextInt();
	double sum=0;
	int k=0;
	while(m!=0)
	{
			if(w[k]<m)
			{
				sum+=1*p[k];
				m-=w[k];
			}
			else
			{
				double x4=m*p[k];
				double x5=w[k];
				double x6=x4/x5;
				sum+=x6;
				m=0;
		}
			k++;
	}
	System.out.println("Profit earned : "+sum);
	}
}