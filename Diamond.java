package java_coe_2024;
import java.util.*;
public class Diamond {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<=n/2-i;j++)
			  System.out.print(" ");
		  for(int j=0;j<=i;j++)
			  System.out.print("* ");
		  for(int j=0;j<=n/2-i;j++)
			  System.out.print(" ");
		  System.out.println();
	  }
	  for(int i=0;i<n-1;i++) {
		  for(int j=0;j<=i;j++)
			  System.out.print(" ");
		  for(int j=0;j<=n/2-i;j++)
			  System.out.print("* ");
		  for(int j=0;j<=i;j++)
			  System.out.print(" ");
		  System.out.println();
	  }
  }
}
