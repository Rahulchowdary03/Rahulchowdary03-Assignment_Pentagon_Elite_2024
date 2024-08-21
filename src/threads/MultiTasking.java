package threads;

class FileSystem extends Thread
{
	void write()
	{
		System.out.println("Writing file");
	}
	void read()
	{
		System.out.println("Reading file");
	}
	
	void delete()
	{
		System.out.println("Deleting file");
	}
	@Override
	public void run()
	{
		write();
		read();
		delete();
	}
}
public class MultiTasking {

	public static void main(String[] args) {
		
		FileSystem fs=new FileSystem();
		Thread t=new Thread(fs);
		t.start();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
		

	}

}
