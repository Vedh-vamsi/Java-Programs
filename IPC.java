package merge;
import java.util.*;
import java.io.*;
	class Bucket
	{
		int x=0;
		 boolean full=false;
		synchronized public void get()
		{
			if(full==false)
			{
				try
				{
					Thread.sleep(500);
					wait();
				}
				catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
			}
			System.out.println("Consumed : "+x);
			full=false;
			notify();
		}
		synchronized public void put(int n)
		{
			if(full==true)
			{
				try
				{
					Thread.sleep(500);
					wait();
				}
				catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
			}
			x=n;
			System.out.println("Produced : "+x);
			full=true;
			notify();
		}
	}
	class Producer extends Thread
	{
		Bucket b;
		Producer(Bucket n)
		{
			this.b=n;
		}
		public void run() {
		for(int i=1;i<=10;i++)
		{
			b.put(i);
		}
		}
	}
	class Consumer extends Thread
	{
		Bucket b;
		Consumer(Bucket b)
		{
			this .b=b;
		}
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				b.get();
			}
		}
	}
	class IPC
	{
		public static void main(String[] args)
		{
			Bucket b=new Bucket();
			Producer p=new Producer(b);
			Consumer c=new Consumer(b);
			Thread t1=new Thread(p);
			Thread t2=new Thread(c);
			t2.start();
			t1.start();
		}
	}
	
