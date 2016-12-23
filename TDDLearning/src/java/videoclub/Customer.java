package videoclub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals;

	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<Rental>();

	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String getRentalRecord() {
		String result = "Rental Record for " + getName() + "\n";
		double totalAmount = 0;
		Iterator<Rental> rentals = this.rentals.iterator();
		while (rentals.hasNext()) {
			Rental eachRental = rentals.next();
			result += eachRental.getDetail();
			totalAmount += eachRental.getAmount();
		}
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";

		return result;
	}

}
