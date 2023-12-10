package merge;
import java.util.*;
public class JogSequencing {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter No. of jobs : ");
    	int n=sc.nextInt();
    	String[] job=new String[n];
    	int p[]=new int[n];
    	int d[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		System.out.print("Enter the job: ");
    		job[i]=sc.next();
    		System.out.print("Enter the profit : ");
    		p[i]=sc.nextInt();
    		System.out.print("Enter the deadline : ");
    		d[i]=sc.nextInt();
    	}
    	System.out.println("Jobs given in order : ");
    	System.out.print("Jobs     : ");
    	for(int i=0;i<n;i++)
    		System.out.print(job[i]+" ");
    	System.out.println();
    	System.out.print("Profit   : ");
    	for(int i=0;i<n;i++)
    		System.out.print(p[i]+" ");
    	System.out.print("Deadline : ");
    	for(int i=0;i<n;i++)
    		System.out.print(d[i]+" ");
    	System.out.println();
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i+1;j<n;j++)
    		{
    			if(p[i]<p[j])
    			{
    				String temp=job[i];
    				job[i]=job[j];
    				job[j]=temp;
    				int temp1=p[i];
    				p[i]=p[j];
    				p[j]=temp1;
    				temp1=d[i];
    				d[i]=d[j];
    				d[j]=temp1;
    			}
    		}
    	}
    	System.out.println("Jobs in decreasing order : ");
    	System.out.print("Jobs    : ");
    	for(int i=0;i<n;i++)
    		System.out.print(job[i]+" ");
    	System.out.println();
    	System.out.print("Profit  : ");
    	for(int i=0;i<n;i++)
    		System.out.print(p[i]+" ");
    	System.out.println();
    	System.out.print("Deadline: ");
    	for(int i=0;i<n;i++)
    		System.out.print(d[i]+" ");
    	System.out.println();
    	int max=d[0];
    	for(int i=0;i<n;i++)
    	{
    		if(d[i]>max)
    			max=d[i];
    	}
    	String s[]=new String[max];
    	int profit=0;
    	for(int i=0;i<n;i++)
    	{
    		int dl=d[i];
    		dl--;
    		if(s[dl]==null)
    		{
    			s[dl]=job[i];
    			profit+=p[i];
    		}
    		else
    		{
    			while(dl!=-1)
    			{
    				if(s[dl]==null)
    				{
    					s[dl]=job[i];
    					profit+=p[i];
    					break;
    				}
    				dl--;
    			}
    		}
    	}
    	System.out.println("Jobs done are : ");
    	for(int i=0;i<max;i++)
    		System.out.print("--->"+s[i]);
    	System.out.println();
    	System.out.println("Profit earned : "+profit);
    }
}
