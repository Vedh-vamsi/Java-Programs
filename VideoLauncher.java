package videorental;
import java.util.*;
public class VideoLauncher {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  VideoStore v=new VideoStore();
	 while(true) {
		 System.out.println("MAIN MENU");
		 System.out.println("==========");
		 System.out.println("1. Add Videos:\n"+"2. Check Out Video : \n"+"3. Return Video : \n"+"4. recieve Rating : \n"+"5. ListInventory : ");
		 System.out.println("Enter your choice:(1....6)--");
		 int op=sc.nextInt();
		 sc.nextLine();
		 switch(op) {
		 case 1: System.out.println("Enter the video name");
		         String name=sc.nextLine();
		         v.addVideo(name);
		         break;
		 case 2: System.out.println("Enter the name of the video you want to checkout: ");
		         String nam=sc.nextLine();
		         v.doCheckout(nam);
		         break;
		 case 3: System.out.println("Enter the name of the video you want to return: ");
		         String na=sc.nextLine();
		         v.doReturn(na);
		         break;
		 case 4: System.out.println("Enter the name of the video you want to give rating: ");
		         String n=sc.nextLine();
		         System.out.println("Enter rating: ");
		         int r=sc.nextInt();
		         v.recieveRating(n,r);
		         break;
		 case 5:v.listInventory();
		         break;
		 case 6:break;

		 }
		 if(op==6) {
			 System.out.println("....!!! Thanks for using the application");
			 break;
		 }
	 }
  }
}
