package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class MovieNameComparator implements Comparator<Movies>
{

	@Override
	public int compare(Movies m1, Movies m2) {
		
		return m1.movie_name.compareTo(m2.movie_name);
	}
	
}
class TicketComparator implements Comparator<Movies>
{

	@Override
	public int compare(Movies m1, Movies m2) {
		
		if(m1.noOfTickets==m2.noOfTickets)
		{
			return 0;
		}
		else if(m1.noOfTickets>m2.noOfTickets)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class ComapratorTest {

	public static void main(String[] args) {
		
		LinkedList<Movies> movielist=new LinkedList<>();
		
		movielist.add(new Movies("Jersey",2,400));
		movielist.add(new Movies("Deadpool",8,1600));
		movielist.add(new Movies("Avengers",6,1200));
		movielist.add(new Movies("Zoro",1,400));
		
		Collections.sort(movielist,new MovieNameComparator());
		
		System.out.println("Sorting based on Name");
		System.out.println("======================");
		for(Movies m:movielist)
		{
			m.details();
		}

	}

}
