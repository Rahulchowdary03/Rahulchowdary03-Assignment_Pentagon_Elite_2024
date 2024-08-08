package collections;

import java.util.TreeSet;

class Flowers
{
	String name;
	int price;
	public Flowers(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
public class TreeSetEx2 {

	public static void main(String[] args) {
		
		Flowers f1=new Flowers("Rose",10);
		Flowers f2=new Flowers("MarieGold",12);
		a
		TreeSet<Flowers> flowerset=new TreeSet<>();
		
		flowerset.add(f1);
		flowerset.add(f2);
	}

}
