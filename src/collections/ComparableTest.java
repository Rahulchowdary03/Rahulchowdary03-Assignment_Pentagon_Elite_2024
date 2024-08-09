package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Flower implements Comparable<Flower>
{
	String name;
	int price;
	public Flower(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString(){
		return "Flowers[name="+name+",price="+price+"]\n";
		
		
	}

	public int compareTo(Flower f) {
		return this.name.compareTo(f.name);
		
	}
	
	
}
public class ComparableTest {

	public static void main(String[] args) {
		
		Flower f1=new Flower("Rose",10);
		Flower f2=new Flower("MarieGold",12);
		Flower f3=new Flower ("Hibiscus",15);
		Flower f4=new Flower("Jasmine",50); 
		
		List<Flower> flowerset=new ArrayList<>();
		
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
