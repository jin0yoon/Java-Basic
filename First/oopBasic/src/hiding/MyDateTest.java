package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate date = new MyDate();
		
		date.setDay(10);
		date.setMonth(7);
		date.setYear(2019);
		
		date.showDate();
		
		MyDate date2 = new MyDate();
		date2.setYear(2002);
	}

}
