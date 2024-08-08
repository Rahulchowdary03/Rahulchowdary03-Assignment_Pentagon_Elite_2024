package polymorphism;

class House
{
	void build()
	{
		System.out.println("Building normal house with 2bhk without stairs");
	}
}
class DuplexHouse extends House
{
	@Override
	void build()
	{
		System.out.println("Implementing old house with new duplex house with extra 3 bedrooms with"
				+ "with stairs ");
	}
}
public class RunTime {

	public static void main(String[] args) {

		House h=new House();
		h.build();

		DuplexHouse dh=new DuplexHouse();
		dh.build();
	}
}
