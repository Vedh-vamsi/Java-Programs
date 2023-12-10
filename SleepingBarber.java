package merge;
import java.util.concurrent.*;
public class SleepingBarber extends Thread{
       public static Semaphore customer=new Semaphore(0);
       public static Semaphore barber=new Semaphore(0);
       public static Semaphore accessSeats=new Semaphore(1);
       public static final int CHAIRS=5;
       public static int nofs=CHAIRS;
       public class Customer extends Thread
       {
    	   int id;
    	   boolean notcut=true;
    	   Customer(int i)
    	   {
    		   id=i;
    	   }
    	   public void run() {
    	   while(notcut)
    	   {
    		   try
    		   {
    			   accessSeats.acquire();
    			   if(nofs>0) {
    				   customer.release();
    			   accessSeats.release();
    			   nofs--;
    			   System.out.println("Customer "+id+" Just sat down");
    		   
    		   try
    		   {
    			   barber.acquire();
    			   notcut=false;
    			   get_hair_cut();
    		   }
    		   catch(InterruptedException ie)
    		   {
    			   System.out.println(ie);
    		   }
    		   }
    		   else
    		   {
    			   System.out.println("There are no free seats ");
    			   accessSeats.release();
    			   notcut=false;
    		   }
    	   }
    		   catch(InterruptedException ie)
    		   {
    			   System.out.println(ie);
    		   }
       }
    	   }
    	   public void get_hair_cut()
    	   {
    		   System.out.println("Customer "+id+"Getting his hair cut");
    		   try
    		   {
    			   sleep(500);
    		   }
    		   catch(Exception e)
    		   {
    			   System.out.println(e);
    		   }
    	   }
       }
       public class Barber extends Thread
       {
    	   Barber(){}
    	   public void run() {
    	   while(true)
    	   {
    		   try {
    		   customer.acquire();
    		   accessSeats.release();
    		   nofs++;
    		   barber.release();
    		   accessSeats.release();
    		   cut_hair();
    		   }
    		   catch(Exception e)
    		   {
    			   System.out.println(e);
    		   }
    	   }
       }
       public void cut_hair()
       {
    	   System.out.println("Barber is cutting hair ");
    	   try
    	   {
    		   sleep(500);
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println(e);
    	   }
       }
}
       public static void main(String[] args)
       {
    	   SleepingBarber sleepingbarber=new SleepingBarber();
    	   sleepingbarber.start();
       }
       public void run()
       {
    	   Barber b=new Barber();
    	   b.start();
    	   for(int i=1;i<=6;i++)
    	   {
    		   Customer acustomer=new Customer(i);
    		   acustomer.start();
    		   try
    		   {
    			   sleep(500);
    		   }
    		   catch(InterruptedException e)
    		   {
    			   System.out.println(e);
    		   }
    	   }
       }
       
}
