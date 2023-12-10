package java_coe_2024;
import java.util.*;
public class Reverse {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int a[][]=new int[n][n];
    	 for(int i=0;i<n;i++) {
    		 for(int j=0;j<n;j++)
    			 a[i][j]=sc.nextInt();
    	 }
    	 for(int i=0;i<n;i++) {
    		 for(int j=0;j<n;j++) {
    			 int temp=a[i][j];
    			 a[i][j]=a[i][n-1-i];
    			 a[i][n-1-i]=temp;
    		 }
    	 }
    	 for(int i=0;i<n-1;i++) {
    		 for(int j=0;j<n;j++) {
    			 int temp=a[i][j];
    			 a[i][j]=a[n-1-i][j];
    			 a[n-1-i][j]=temp;
    		 }
    	 }
    	 for(int i=0;i<n;i++)
    	 {
    		 for(int j=0;j<n;j++) {
    			 System.out.print(a[i][j]+" ");
    		 }
    		 System.out.println();
    	 }
    	
     }
}
