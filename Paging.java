package merge;
import java.util.*;
public class Paging {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of bits in logical address :  ");
		int n=sc.nextInt();
		System.out.println("Ënter no, of bits in physical address : ");
		int m=sc.nextInt();
		System.out.println("enter page size : ");
		int p=sc.nextInt();
		int laddrspace=(int)Math.pow(2, n);
		int paddrspace=(int)Math.pow(2, m);
		int pages=laddrspace/p;
		int frames=paddrspace/p;
		int page[]=new int[pages];
		int frame[]=new int[frames];
		table(page,pages,frame,frames);
		System.out.println("Enter logical address : ");
		int laddr=sc.nextInt();
		int pageno=laddr/p;
		int d=laddr%p;
		int paddr=page[pageno]*p+d;
		System.out.println(paddr);
	}
	public static void table(int page[],int pages,int frame[],int frames)
	{
		int f,i;
		Scanner sc=new Scanner(System.in);
		Arrays.fill(frame, -1);
		for(i=0;i<pages;i++)
		{
			System.out.println("Enter frame no. for page - "+(i+1)+" - ");
			f=sc.nextInt();
			page[i]=f;
			frame[f]=i;
		}
		System.out.println("pageno.\tframeno.");
		for(i=0;i<pages;i++)
		{
			System.out.println(i+"    \t    "+page[i]);
		}
		System.out.println("frameno.\tpageno.");
		for(i=0;i<frames;i++)
		{
			System.out.println(i+"    \t    "+frame[i]);
		}
	}

}
