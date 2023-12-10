package merge;
import java.util.*;
public class AllPairShortestPath {
          public static void flyd(int w[][],int n)
          {
        	  int i,j,k;
        	  for(k=1;k<=n;k++)
        	  {
        		  for(i=1;i<=n;i++)
        		  {
        			  for(j=1;j<=n;j++)
        			  {
        				  w[i][j]=Math.min(w[i][j], w[i][k]+w[k][j]);
        			  }
        		  }
        	  }
          }
          public static void main(String[] args)
          {
        	  int w[][]=new int[10][10];
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Enter no. of vertices : ");
        	  int n=sc.nextInt();
        	  System.out.println("Enter Cost Adjacency matrix : ");
        	  for(int i=1;i<=n;i++) {
        		  for(int j=1;j<=n;j++) {
        			  w[i][j]=sc.nextInt();
        		  }
        	  }
        	  flyd(w, n);
        	  System.out.println("Minimum cost matrix : ");
        	  for(int i=1;i<=n;i++)
        	  {
        		  for(int j=1;j<=n;j++)
        		  {
        			  System.out.print(w[i][j]+" ");
        		  }
        		 System.out.println(); 
        	  }
          }
}
