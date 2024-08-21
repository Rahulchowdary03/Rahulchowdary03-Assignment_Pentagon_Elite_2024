package threads;

 class Count extends Thread
 {
	 void count() throws InterruptedException 
	 {
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println("Count : "+i);
		 }
	 }
	 @Override
	 public void run()
	 {
		 try {
			 count();
		 }
		 catch(InterruptedException e){
			 e.printStackTrace();
			 
		 }
	 }
	 
 }
 

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread t1=new Thread();
		
		Count c= new Count();
		
		c.start();

	}

}
