package merge;
import java.util.*;
public class BestFit {
	static void bestfit(int blockSize[],int n,int processSize[],int m)
	{
		int allocated[]=new int[m];
		for(int i=0;i<allocated.length;i++)
			allocated[i]=-1;
		for(int i=0;i<m;i++)
		{
			int bestid=-1;
			for(int j=0;j<n;j++)
			{
				if(blockSize[j]>=processSize[i])
				{
					if(bestid==-1)
						bestid=j;
					else if(blockSize[bestid]>blockSize[j])
						bestid=j;
				}
			}
			if(bestid!=-1)
			{
				allocated[i]=bestid;
				blockSize[i]-=processSize[i];
			}
		}
		System.out.println("NO.    process      allocated");
		for(int i=0;i<m;i++)
		{
	    System.out.print((i+1)+"    "+processSize[i]+"");
	    if(allocated[i]!=-1)
	    	System.out.println("    "+allocated[i]);
		}
	}
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter no. of blocks : ");
    	int n=sc.nextInt();
    	System.out.println("Enter no. of processes : ");
    	int m=sc.nextInt();
    	System.out.println("Enter blocks : ");
    	int b[]=new int[n];
    	int p[]=new int[m];
    	for(int i=0;i<n;i++)
    		b[i]=sc.nextInt();
    	System.out.println("Enter process size : ");
    	for(int i=0;i<m;i++)
    		p[i]=sc.nextInt();
    	
    	bestfit(b,n,p,m);
    }
}
