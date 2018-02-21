import by.gsu.asoilab.BusinessTrip;
import by.gsu.asoilab.Converter;

public class Runner {

	public static void main(String[] args) {

		BusinessTrip[] trips = new BusinessTrip[] {
				new BusinessTrip("Jon", 110, 210), null,
				new BusinessTrip("Josh", 231, 85),
				new BusinessTrip("Brad", 233, 222),
				new BusinessTrip("Ilon", 208, 37),
				new BusinessTrip("Clark", 99, 45),
				new BusinessTrip() };

		for (BusinessTrip trip : trips) {
			if (trip != null) {
				trip.show();
			}

		}

		trips[trips.length - 1].setTransport(30);
		System.out.println("Duration = " + (trips[0].getDays() + trips[1].getDays()));
		
		for (BusinessTrip businessTrip : trips) {
			System.out.println(businessTrip);
		}
		
		int totalSum = 0;
		for(BusinessTrip trip : trips){
			totalSum += trip.getTotal();
		}
		System.out.println(totalSum);

	}
}