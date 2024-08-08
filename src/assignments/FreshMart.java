package assignments;

import java.util.Scanner;
class Product
{
	int id;
	String name;
	int quantity;
	double price;
	public Product(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
}
public class FreshMart {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Product[] products=new Product[10];
		int index=0;
		while(true) {
		System.out.println("Enter your choice");
		
		System.out.println("1.Add Product");
		
		System.out.println("2.View Product");
		
		System.out.println("3.Modify");
		
		System.out.println("4.Buy Product");
		
		System.out.println("5.Exit");
		
		int option=sc.nextInt();
		switch(option) {
		
		case 1:
			if(index<10) 
			{
				System.out.println("Enter Product id");
				int id=sc.nextInt();
				System.out.println("Enter product name");
				String name=sc.next();
				System.out.println("Enter quantity");
				int quantity=sc.nextInt();
				System.out.println("Enter price");
				double price=sc.nextDouble();
				products[index]=new Product(id,name,quantity,price);
				index++;
			}
			
				
			break;
			
		case 2:
			System.out.println("Product Deatails");
			System.out.println("ID\t|Name\t|Quantity\t|Price");
			for(int i=0;i<index;i++) {
				Product product=products[i];
				System.out.println(product.id+"\t|"+product.name+"\t|"+product.quantity+"\t|"+product.price);
			}
				break;
			
		case 3:
			System.out.println("Enter product id to modify");
			int id1=sc.nextInt();
			for (int i = 0; i < index; i++) 
			{
	            Product product = products[i];
	            if (product.id == id1) {
	                System.out.println("Enter new product name :");
	                String newName = sc.next();
	                if (!newName.isEmpty())
	                {
	                    product.name = newName;
	                }
	                System.out.println("Enter new product quantity :");
	                String newQuantity = sc.next();
	                if (!newQuantity.isEmpty())
	                {
	                    product.quantity = Integer.parseInt(newQuantity);
	                }
	                System.out.println("Enter new product price :");
	                String newPrice = sc.next();
	                if (!newPrice.isEmpty()) 
	                {
	                    product.price = Double.parseDouble(newPrice);
	                }
	                System.out.println("Product modified successfully!");
	                break;
	            }
	        }
	    break;

		case 4:
			System.out.println("Enter product id to buy");
            int id2 = sc.nextInt();

            for (int i = 0; i < index; i++) 
            {
                Product product = products[i];
                if (product.id == id2) 
                {
                    System.out.println("Enter quantity to buy:");
                    int buyQuantity = sc.nextInt();

                    if (buyQuantity <= product.quantity) 
                    {
                        product.quantity -= buyQuantity;
                        double total = buyQuantity * product.price;
                        System.out.println("Total amount: " + total);
                        System.out.println("Product bought successfully!");
                    }
                    else 
                    {
                        System.out.println("Insufficient quantity!");
                    }
                    break;
                }
            }
            break;

		case 5:
			System.out.println("Exiting...");
            sc.close();
            System.exit(0);
            break;

        

			
		}
		}
	}
}
