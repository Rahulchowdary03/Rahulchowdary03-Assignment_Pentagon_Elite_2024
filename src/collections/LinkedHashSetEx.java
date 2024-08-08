package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Food{
	String type;
	String foodname;
	float price;
	public Food(String type, String foodname, float price) {
		super();
		this.type = type;
		this.foodname = foodname;
		this.price = price;
	}
	void display()
	{
		
		System.out.println(this.type+"\t\t|\t"+this.foodname+"\t|\t"+this.price+"\t|\t");
		System.out.println("------------------------------------------------------------");
	}
	
}
public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		Food f1=new Food("Non-Veg","Tandoori",300);
		Food f2=new Food("Non-Veg","Pepper Chicken",200);
		Food f3=new Food("Veg","Mushroom Dry",150);
		Food f4=new Food("Non-Veg","Kushka-Kabab",100);

		LinkedHashSet<Food> lhs=new LinkedHashSet<>();
		
		Collections.addAll(lhs,f1,f2,f3,f4);
		
		
		Iterator<Food>itr=lhs.iterator();
		System.out.println("Food Type"+"\t|\t"+"Food Name"+"\t|\t"+"Price"+"\t|\t");
		System.out.println("------------------------------------------------------------");
		while(itr.hasNext())
		{
			Food food=itr.next();
			food.display();
			}
		
	}

}
