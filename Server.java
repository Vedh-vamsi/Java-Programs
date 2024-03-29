package merge;
import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
private Socket socket=null;
private ServerSocket server=null;
private DataInputStream in=null;
public Server(int port) {
	try {
	server=new ServerSocket(port);
	System.out.println("Server Started");
	System.out.println("Waiting for the client...");
	socket=server.accept();
	System.out.println("Client Accepted");
	in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	String line="";
	while(!line.equals("Over")) {
		try {
			line=in.readUTF();
			System.out.println(line);
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}
	System.out.println("Closing connection");
	socket.close();
	in.close();
	}
	catch(Exception e){
		System.out.println(e);
	}	
}
public static void main(String[] args)
{
	Server server=new Server(5000);
}
}
