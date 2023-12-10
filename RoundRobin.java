package merge;
import java.util.*;
public class RoundRobin {
         public static void main(String[] args)
         {
        	 int n,i,count=0,qt,sq=0,temp,bt[],wt[],tat[],rem_bt[];
        	 float awt=0,atat=0;
        	 System.out.println("Enter no. of processes : ");
        	 Scanner sc=new Scanner(System.in);
        	 n=sc.nextInt();
        	 bt=new int[10];
        	 wt=new int[10];
        	 tat=new int[10];
        	 rem_bt=new int[10];
        	 for(i=0;i<n;i++)
        	 {
        		 System.out.print("p"+" = ");
        		 bt[i]=sc.nextInt();
        	 }
        	 System.out.println("Enter Quantum time : ");
        	 qt=sc.nextInt();
        	 while(true)
        	 {
        		 for(i=0,count=0;i<n;i++)
        		 {
        			 temp=qt;
        			 if(rem_bt[i]==0)
        			 {
        				 count++;
        				 continue;
        			 }
        			 if(rem_bt[i]>qt)
        			 {
        				 rem_bt[i]-=qt;
        			 }
        			 else if(rem_bt[i]<qt)
        			 {
        				 temp=rem_bt[i];
        				 rem_bt[i]=0;
        			 }
        		 }
        		 if(count==n)
        			 break;
        	 }
        	 System.out.print("-----------------------------------------------------------");
        	 
        	 }
}
