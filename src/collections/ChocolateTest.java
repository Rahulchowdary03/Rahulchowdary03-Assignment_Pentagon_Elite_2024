package collections;

import java.util.ArrayList;
import java.util.List;

class Chocolate{
	String name;
	String flavour;
	String toWhom;
	double price;

	public Chocolate(String name, String flavour, String toWhom, double price) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.toWhom = toWhom;
		this.price = price;
	}
	void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Flavour : "+this.flavour);
		System.out.println("toWhom : "+this.toWhom);
		System.out.println("Price : "+this.price);
	}
}

public class ChocolateTest {
	
	

	public static void main(String[] args) {
		
		Chocolate c1=new Chocolate("KitKat","Crispy","Friend",30);
		
		Chocolate c2=new Chocolate("Dairy Milk","Nuts & Fruits","Friend",190);
		
		Chocolate c3=new Chocolate("Snickers","Peanut","Friend",70);
		
		Chocolate c4=new Chocolate("Fuse","Nuts","Friend",80);
		
		List<Chocolate>chocolist=new ArrayList<Chocolate>();
		
		chocolist.add(c1);
		chocolist.add(c2);
		chocolist.add(c3);
		chocolist.add(c4);
		for(Chocolate c:chocolist)
		{
			c.display();
			System.out.println("====================");
		}
		chocolist.remove(c4);
		for(Chocolate c:chocolist)
		{
			c.display();
			System.out.println("====================");
		}
	}
	

}
