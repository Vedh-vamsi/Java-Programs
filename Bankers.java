package merge;
import java.util.*;
public class Bankers {
	private static int need[][],allocate[][],max[][],avail[][],total[][],np,nr;
	public static void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of processes and no. of resources");
		np=sc.nextInt();
		nr=sc.nextInt();
		need=new int[np][nr];
		allocate=new int[np][nr];
		max=new int[np][nr];
		avail=new int[1][nr];
		total=new int[1][nr];
		System.out.println("Enter the Allocated matrix : ");
		for(int i=0;i<np;i++)
			for(int j=0;j<nr;j++) {
				allocate[i][j]=sc.nextInt();
				avail[0][j]+=allocate[i][j];
			}
		System.out.println("Enter max matrix : ");
		for(int i=0;i<np;i++)
			for(int j=0;j<nr;j++)
				max[i][j]=sc.nextInt();
		System.out.println("Enter the total resourse matrix : ");
		for(int j=0;j<nr;j++)
		{
			total[0][j]=sc.nextInt();
			avail[0][j]=total[0][j]-avail[0][j];
		}
			
	}
	public static int[][] calc_need()
	{
		for(int i=0;i<np;i++)
			for(int j=0;j<nr;j++)
				need[i][j]=max[i][j]-allocate[i][j];
		return need;
	}
	public static boolean check(int i)
	{
		for(int j=0;j<nr;j++)
		{
			if(avail[0][j]<need[i][j])
				return false;
		}
		return true;
	}
	public static void isSafe()
	{
		input();
		calc_need();
		boolean done[]=new boolean[np];
		int j=0;
		while(j<np)
		{
			boolean allocated=false;
			for(int i=0;i<np;i++)
			{
				if(!done[i]&&check(i)) {
				    for(int k=0;k<nr;k++)
					avail[0][k]=avail[0][k]-need[i][k]+max[i][k];
			System.out.println("Allocated  process : "+i);
			done[i]=allocated=true;
			j++;
			for(int l=0;l<i;l++)
			{
				if(!done[l]&&check(l)) {
					for(int m=0;m<nr;m++)
						avail[0][m]=avail[0][m]-need[i][m]+max[i][m];
				System.out.println("Allocated process : "+l);
				done[l]=allocated=true;
				j++;
				}
			}
	      }
		}
			if(!allocated) break;
	}
		if(j==np)
			System.out.println("All processes safely allocated ");
		else
			System.out.println("All processes cannot be allocated ");
}
	public static void main(String[] args)
	{
		isSafe();
	}
}