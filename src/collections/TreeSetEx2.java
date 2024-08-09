package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Flowers implements Comparable<Flowers>
{
	String name;
	int price;
	public Flowers(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString(){
		return "Flowers[name="+name+",price="+price+"]\n";
		
		
	}

//	public int compareTo(Flowers f) {
//		return this.name.compareTo(f.name);
//		
//	}
	@Override
	public int compareTo(Flowers f)
	{
//		return f.price=this.price;
		if(this.price==f.price)
		{
			return 0;
			
		}
		else if(this.price>f.price)
		{
			return 1;
//			return -1;//(descending)
		}
		else
		{
			return -1;
//			return 1;
		}
		
	}
}
public class TreeSetEx2 {

	public static void main(String[] args) {
		
		Flowers f1=new Flowers("Rose",10);
		Flowers f2=new Flowers("MarieGold",12);
		Flowers f3=new Flowers ("Hibiscus",15);
		Flowers f4=new Flowers("Jasmine",50); 
		
		List<Flowers> flowerset=new ArrayList<>();
		
		flowerset.add(f1);
		flowerset.add(f2);
		flowerset.add(f3);
		flowerset.add(f4);
		Collections.sort(flowerset);
		System.out.println(flowerset);
		
		String str1="Naveen";
		String str2="Nitin";
		
		System.out.println(str1.compareTo(str2));
	}

}
