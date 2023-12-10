package videorental;
import java.util.*;
public class VideoStore {
	 HashMap<String,Video> store=new HashMap<>();
	public void addVideo(String name) {
		if(!store.containsKey(name)) {
			Video ob=new Video(name);
			store.put(name, ob);
		}
	}
	public void doCheckout(String name) {
		if(store.containsKey(name))
		store.get(name).doCheckout();
	}
	public void doReturn(String name) {
		if(store.containsKey(name))
		store.get(name).doReturn(false);
	}
	public void recieveRating(String name,int rating)
	{
		if(store.containsKey(name))
		store.get(name).RecieveRating(rating);
	}
	public void listInventory() {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Video Name      |     Checkout Status    |     Rating");
		for(String vid:store.keySet()) {
			System.out.println(store.get(vid).videoName+"          |     "+store.get(vid).checkout+"              |      "+store.get(vid).rating);
			
		}
		System.out.println("-----------------------------------------------------------");
	}
}
