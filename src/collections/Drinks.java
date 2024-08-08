package collections;

public class Drinks {

	String type;
	String brand;
	double quantity;
	double price;
	
	public Drinks(String type, String brand, double quantity, double price) {
		super();
		this.type = type;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}

	public String toString(){
		return  "Type:"+type+"\nBrand:"+brand+"\nQuantity:"+quantity+"\nPrice:"+price+"\n";
		
	}
	
	
	
		

	

}
