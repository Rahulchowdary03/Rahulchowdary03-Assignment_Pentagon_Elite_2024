package collections;

public class Movies {

	String movie_name;
	int noOfTickets;
	double price;
	public Movies(String movie_name, int noOfTickets, double price) {
		super();
		this.movie_name = movie_name;
		this.noOfTickets = noOfTickets;
		this.price = price;
	}
	void details()
	{
		System.out.println("Sting movieName: "+this.movie_name);
		System.out.println("NoOfTickets: "+this.noOfTickets);
		System.out.println("Price: "+this.price);
	}

}
