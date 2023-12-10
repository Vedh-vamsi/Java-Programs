package merge;

public class MultiThread extends Thread {
	String task;
	MultiThread(String t)
	{
		this.task=t;
	}
	synchronized public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(task+" : "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie.getMessage());
			}
		}
	}
	public static void main(String[] args)
	{
		MultiThread th1=new MultiThread("\ncut the ticket");
		MultiThread th2=new MultiThread("\nshow your seat number");
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		t1.start();
		t2.start();
	}

}
