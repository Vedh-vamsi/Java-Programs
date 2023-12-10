package java_coe_2024;
import java.util.*;
public class ElectronicWatch {
            public static void main(String[] args) {
            	Scanner sc=new Scanner(System.in);
            	int sec=sc.nextInt();
            	int S=sec%60;
            	int h=sec/60;
            	int m=h%60;
            	h/=60;
            	sec%=60;
            	h%=24;
            	System.out.println("Hour:"+String.format("%02d",h)+" Min:"+String.format("%02d",m)+" Sec:"+String.format("%02d",sec));
 
            }
}
