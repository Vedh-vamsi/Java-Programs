package java_coe_2024;
import java.io.*;
public class Strings {
 public static void main(String[] args) {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  StringBuffer s1=new StringBuffer("vamsi");
	  StringBuffer s3=new StringBuffer(s1);
	  StringBuffer s2=s1;
	  System.out.println(s2.deleteCharAt(1));
	  System.out.println(s1);
	  System.out.println(s3);
	  String ss1="abc";
	  String ss2="abc";
	  System.out.println(ss1.equals(ss2));
	  System.out.println(ss1==ss2);
 }
}
