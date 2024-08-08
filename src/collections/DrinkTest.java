package collections;

import java.util.ArrayList;
import java.util.Collections;

public class DrinkTest {

	public static void main(String[] args) {
		
	Drinks d1=new Drinks("SoftDrinks","CoCoCola",2,95);
	
	Drinks d2=new Drinks("HotDrinks","Black&White",0.75,2400);
	
	Drinks d3=new Drinks("SoftDrinks","Maaza",.50,50);
	
	Drinks d4=new Drinks("Beer","Kingfisher",.650,190);
	
	Drinks d5=new Drinks("Vodka","Green Apple",.75,95);
	
	ArrayList<Drinks>drinkslist=new ArrayList<>();
	
	Collections.addAll(drinkslist, d1,d2,d3,d4,d5);
	
	for(Drinks d:drinkslist)
	{
		System.out.println(d);
	}
	
	//	System.out.println(d1);

	}

}
