package merge;
import java.io.*;
import java.util.*;
import java.net.*;
public class MyClient {
 public static void main(String[] args)throws Exception {
	 InetAddress host=InetAddress.getLocalHost();
	 Socket socket=null;
	 ObjectOutputStream oos=null;
	 ObjectInputStream ois=null;
	 for(int i=0;i<5;i++) {
		 socket=new Socket(host.getCanonicalHostName(),9876);
		 oos=new ObjectOutputStream(socket.getOutputStream());
		 System.out.println("Sending request to the server");
		 if(i==4) oos.writeObject("exit");
		 else oos.writeObject(""+i);
		 ois=new ObjectInputStream(socket.getInputStream());
		 String msg=(String)ois.readObject();
		 System.out.println("Message"+msg);
		 
		 
	 }
 }
}
