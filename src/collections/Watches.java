package collections;

public class Watches {

	String name;
	String type;
	double price;
	String category;
 
	
	public Watches(String name, String type, double price, String category) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.category=category;
	}

	

	@Override
	public String toString() {
		return "Watches [name=" + name + ", type=" + type + ", price=" + price + ", category=" + category + "]";
	}

}
