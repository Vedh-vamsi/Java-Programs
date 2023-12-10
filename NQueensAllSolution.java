package merge;
import java.util.*;
public class NQueensAllSolution {
       static private int count=0;
       public static boolean isSafe(char[][] mat,int r,int c)
       {
    	   for(int i=0;i<r;i++)
    	   {
    		   if(mat[i][c]=='Q')
    			   return false;
    	   }
    	   for(int i=r,j=c;i>=0&&j>=0;i--,j--)
    	   {
    		   if(mat[i][j]=='Q')
    			   return false;
    	   }
    	   for(int i=r,j=c;i>=0&&j<mat.length;i--,j++)
    	   {
    		   if(mat[i][j]=='Q')
    			   return false;
    	   }
    	   return true;
       }
       public static void printSolution(char[][] mat)
       {
    	   int []sol=new int[mat.length];
    	   for(int i=0;i<mat.length;i++)
    	   {
    		   for(int j=0;j<mat.length;j++)
    		   {
    			 if(mat[i][j]=='Q')
    				 sol[i]=j;
    	   }
    	   }
    	   System.out.println("Queen Positions : ");
    	   for(int i=0;i<mat.length;i++)
    		   System.out.print((sol[i]+1)+" ");
    	   System.out.println();
    	   count++;   
       }
       public static void Nqueen(char[][] mat,int r)
       {
    	   if(r==mat.length)
    	   {
    		   printSolution(mat);
    		   return;
    	   }
    	   for(int i=0;i<mat.length;i++)
    	   {
    		   if(isSafe(mat,r,i))
    		   {
    			   mat[r][i]='Q';
    			   Nqueen(mat,r+1);
    			   mat[r][i]='-';
    		   }
    	   }
       }
       public static void main(String[] args)
       {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter number of queens : ");
    	   int r=sc.nextInt();
    	   char[][] mat=new char[r][r];
    	   for(int i=0;i<r;i++)
    		   Arrays.fill(mat[i], '-');
    	   Nqueen(mat,0);
    	   System.out.println("No. of solutions : "+count);
       }
}
