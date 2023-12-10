package merge;
import java.io.*;
import java.net.*;
import java.util.*;
public class DNS {
   public static void main(String[] args) {
	   int n;
	   Scanner sc=new Scanner(System.in);
	   do {
		   System.out.println("\n Menu: \n 1. DNS 2.Exit\n");
		   System.out.println("Enter your choice: ");
		   n=sc.nextInt();
		   if(n==1) {
			   try {
				   System.out.println("\nEnter Host Name");
				   sc.nextLine();
				   String hname=sc.nextLine();
				   InetAddress add;
				   add=InetAddress.getByName(hname);
				   System.out.println("Host Name: "+add.getHostName());
				   System.out.println("IP: "+add.getHostAddress());
			   }
			   catch(Exception ioe) {
				   ioe.printStackTrace();
			   }
		   }
	   }while(n!=2);
   }
}
