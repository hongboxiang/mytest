package videoclub;

public class Rental {
	private Movie movie;
	private int daysRented;
	private double amount;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
		calculateAmount();
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getAmount() {
		return amount;
	}

	public double calculateAmount(){
		switch (getMovie().getMovieType()) {
			case REGULAR:
				amount = calculateRegularAmount();
				break;
			case NEW_RELEASE:
				amount = calculateNewReleaseAmount();
				break;
			case CHILDRENS:
				amount = calculateChildrensAmount();
				break;
		}
		return amount;
	}


	public double calculateChildrensAmount() {
		double thisAmount = 0;
		thisAmount += 1;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 3;
		return thisAmount;
	}

	public double calculateNewReleaseAmount() {
		double thisAmount = 0;
		thisAmount += daysRented * 3;
		return thisAmount;
	}

	public double calculateRegularAmount() {
		double thisAmount = 0;
		thisAmount += 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 2;
		return thisAmount;
	}

	public String getDetail() {
		String detail = "\t" + getMovie().getTitle() + "\t"
                + String.valueOf(amount) + "\n";
		return detail;
	}
}
