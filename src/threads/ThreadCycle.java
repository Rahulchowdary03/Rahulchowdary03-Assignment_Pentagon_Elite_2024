package threads;

class Demo implements Runnable {
	void disp()
	{
		System.out.println("Running a display method");
	}
	@Override
	public void run()
	{
		disp();
	}
	
}
public class ThreadCycle {

	public static void main(String[] args) throws InterruptedException {
		
		Demo d=new Demo();
		
		Thread t=new Thread(d);
		
		System.out.println(t.getState());
		
		t.start();
		
		System.out.println(t.getState());
		
		Thread.sleep(3000);
		
		System.out.println(t.getState());
		
		t.join();
		
		Thread t1=new Thread();
		 
		t1.start();
		
		t1.join();
		
		System.out.println(t1.getState());

	}

}
