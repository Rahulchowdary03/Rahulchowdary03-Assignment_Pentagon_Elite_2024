package encapsulation;


class Movie
{
	private String movieName;
	private double price;
	private String movieCatagory;
	private String language;
	
	private int availableTickets=50;

	private int noOfTickets;

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public void setMovieCatagory(String movieCatagory) {
		this.movieCatagory = movieCatagory;
	}

	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}

	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setMovieCatogory(String movieCatagory)
	{
		this.movieCatagory=movieCatagory;
	}

	public void setLanguage(String language)
	{
		this.language=language;
	}
	public String getMovieName()
	{

		return movieName;
	}

	public double getPrice()
	{
		return price;
	}

	public String getMovieCatagory()
	{
		return movieCatagory;
	}

	public String getLanguage()
	{
		return language;
	}

	public double getTotalPrice()
	{
		return price*noOfTickets;
	}
	
	public int getAvailableTicket()
	{
		return availableTickets;
	}
	
	public int getRemainingTickets()
	{
		return availableTickets-noOfTickets;
	}

}

public class MovieTest {

	public static void main(String[] args) {


		Movie movie1=new Movie();

		movie1.setMovieName("Despicable 4");

		movie1.setMovieCatogory("Cartoon");

		movie1.setLanguage("English");
		movie1.setPrice(300);
		
		movie1.setNoOfTickets(3);


		System.out.println("Movie Details");

		System.out.println("Movie Name : "+movie1.getMovieName());

		System.out.println("Movie Catagory : "+movie1.getMovieCatagory());

		System.out.println("Movie Lannguage : "+movie1.getLanguage());

		System.out.println("Movie PRice : "+movie1.getPrice());
		
		System.out.println("No Of Tickets Available : "+movie1.getAvailableTicket());
		
		System.out.println("No Of Tickets Booking : "+movie1.getNoOfTickets());
		
		System.out.println("Total Price: "+movie1.getTotalPrice());
		
		System.out.println("Remaining Tickets : "+movie1.getRemainingTickets());



	}

}

