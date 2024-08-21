package threads;

import java.util.Random;

class BookTicket implements Runnable
{
	String task;
	Random rand = new Random();

	BookTicket(String task)
	{
		this.task=task;
	}
	
	@Override
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
//			int randomNumber =rand.nextInt(5+1);
			System.out.println(this.task+" "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    }
	
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		

		BookTicket b1= new BookTicket("Issuing a Ticket");
		
		BookTicket b2= new BookTicket("Alloting  Seat no");
		
		Thread t1=new Thread(b1);
		
		Thread t2=new Thread(b2);
		
		t1.start();
		
		t2.start();
	}

}
