package java_coe_2024;
import java.util.*;
public class Array {
          public static void main(String[] args) {
        	  Scanner sc=new Scanner(System.in);
        	  int a[]=new int[10];
        	  Arrays.fill(a,0);
        	  System.out.println(a);
        	  for (int i:a) {
        		  System.out.print(i+" ");
        	  }
        	  System.out.println();
        	  for(int i=0;i<10;i++)
            	  a[i]=sc.nextInt();
        	  int ele=sc.nextInt();
        	  System.out.println("index:"+Arrays.binarySearch(a, ele));
        	  int b[];
        	  b=Arrays.copyOf(a, 5);
        	  for (int i:b)
        		  System.out.print(i+" ");
        	  System.out.println();
        	  int c[];
        	  c=Arrays.copyOfRange(a, 2, 9);
        	  for (int i:c)
        		  System.out.print(i+" ");
        	  System.out.println();
        	  System.out.println(Arrays.compare(a, b));
        	  System.out.println("String"+Arrays.toString(a));
        	  //System.out.println("String"+Arrays.deepToString(a));
          }
}
