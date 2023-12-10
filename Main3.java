package merge;

import java.util.*;
import java.lang.*;
import java.util.regex.*;
class Main3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			String regex = "^0+(?!$)";
			StringBuffer s1=new StringBuffer(""+n1);
			StringBuffer s2=new StringBuffer(""+n2);
			s1.reverse();
			s2.reverse();
		    String l1=s1.toString();
			String l2=s2.toString();	
			l1 = l1.replaceAll(regex, "");
			l2 = l2.replaceAll(regex, "");
			int p1=Integer.parseInt(l1);
			int p2=Integer.parseInt(l2);
			int p3=p1+p2;
			StringBuffer s=new StringBuffer(""+p3);
			s.reverse();
			String s3=s.toString();
			s3=s3.replaceAll(regex,"");
			System.out.println(s3);
		}
	}
}