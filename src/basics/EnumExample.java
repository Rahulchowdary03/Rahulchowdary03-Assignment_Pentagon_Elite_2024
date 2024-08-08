package basics;
enum Day
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}

public class EnumExample {

	public static void main(String[] args) {
		
		Day day=Day.SATURDAY;
		
		switch(day)
		{
		case SUNDAY:
			System.out.println();
			break;
		case MONDAY:
			System.out.println();
			break;
		case TUESDAY:
			System.out.println();
			break;
		case WEDNESDAY:
			System.out.println();
			break;
		case THURSDAY:
			System.out.println();
			break;
		case FRIDAY:
			System.out.println();
			break;
		case SATURDAY:
			System.out.println();
			break;
		}

	}

}
