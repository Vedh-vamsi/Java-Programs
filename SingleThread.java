package merge;
import java.io.*;
import java.util.*;
public class SingleThread implements Runnable {
	static int a=20,b=10;
	public void run()
	{
		addition();
		subtraction();
		multiplication();
	}
	public static void addition()
	{
		int sum=a+b;
		System.out.println("Addition : "+sum);
	}
    public static void subtraction()
    {
    	int sub=a-b;
    	System.out.println("Subtraction : "+sub);
    }
    public static void multiplication()
    {
    	int mul=a*b;
    	System.out.println("Multiplication : "+mul);
    }
    public static void main(String[] args)
    {
    	System.out.println("Main Thread is running ");
    	SingleThread th=new SingleThread();
    	Thread t=new Thread(th);
    	t.start();
    }
}

