class CarRental {
    private final String customerName;
    private final String carModel;
    private final int rentalDays;
    private final double dailyRate;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rate per day: Rs" + dailyRate);
        System.out.println("Total Cost: Rs" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental car1 = new CarRental("Loveleen", "Toyota Camry", 5, 1000.0);
        CarRental car2 = new CarRental("Yagyata", "Maruti Suzuki Dzire", 5, 800.0);

        System.out.println("Car 1: ");
        car1.displayDetails();
        System.out.println("Car 2: ");
        car2.displayDetails();
    }
}
/*
Car 1:
Customer Name: Loveleen
Car Model: Toyota Camry
Rental Days: 5
Rate per day: Rs1000.0
Total Cost: Rs5000.0
Car 2:
Customer Name: Yagyata
Car Model: Maruti Suzuki Dzire
Rental Days: 5
Rate per day: Rs800.0
Total Cost: Rs4000.0
*/