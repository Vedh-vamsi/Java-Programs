package merge;
import java.io.*;
import java.util.*;
public class LeakyBucket {
   public static void main(String[] args) {
	   int no_of_quer,str,out_pkt_size;
	   int inp_pkt_size,bucket_size,size_left;
	   str=0;
	   no_of_quer=4;
	   bucket_size=10;
	   inp_pkt_size=4;
	   out_pkt_size=1;
	  for(int i=0;i<no_of_quer;i++) {
		  size_left=bucket_size-str;
		  if(inp_pkt_size<=(size_left)) {
			  str+=inp_pkt_size;
		  }
		  else
		  {
			  System.out.println("Packet loss = "+inp_pkt_size);
		  }
		  System.out.println("Buffer size= "+str+"Out of bucket size="+bucket_size);
		  str-=out_pkt_size;
	  }
   }
}
