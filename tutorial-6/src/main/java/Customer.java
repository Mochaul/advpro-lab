import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Iterator<Rental> iterator = rentals.iterator();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        while (iterator.hasNext()) {
            Rental each = iterator.next();

            // Show figures for this rental
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(String.valueOf(each.getPriceAmount())).append("\n");
        }

        // Add footer lines
        result.append("Amount owed is ").append(String.valueOf(getTotalAmount())).append("\n");
        result.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");

        return result.toString();
    }

    private int getTotalFrequentRenterPoints() {
        Iterator<Rental> iterator = rentals.iterator();
        int frequentRenterPoints = 0;
        while (iterator.hasNext()) {
            Rental each = iterator.next();
            frequentRenterPoints+= each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    private double getTotalAmount() {
        Iterator<Rental> iterator = rentals.iterator();
        double totalAmount = 0;
        while (iterator.hasNext()) {
            Rental each = iterator.next();
            for(Rental rent: rentals){
                totalAmount += rent.getPriceAmount();
            }
        }
        return totalAmount;
    }
}
