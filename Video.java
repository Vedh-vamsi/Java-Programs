package videorental;

public class Video {
      String videoName;
      boolean checkout;
      int rating;
      public Video(String name){
    	  videoName=name;
    	  checkout=false;
    	  rating=0;
      }
	public String getName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public boolean getCheckout() {
		return checkout;
	}
	public void doReturn(boolean checkout) {
		this.checkout = checkout;
	}
	public int getRating() {
		return rating;
	}
	public void RecieveRating(int rating) {
		this.rating = rating;
	}  
	public void doCheckout() {
		checkout=true;		
	}
}
