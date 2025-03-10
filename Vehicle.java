class Vehicle {
    private final String ownerName;
    private final String vehicleType;
    private static double registrationFee = 5000.0; // fixed for all vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Loveleen", "Car");
        Vehicle v2 = new Vehicle("Yagyata", "Motorcycle");

        System.out.println("Vehicle registration details:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        System.out.println();

        // Update the registration fee
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("After updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

/*
Vehicle registration details:
Owner Name: Loveleen
Vehicle Type: Car
Registration Fee: Rs5000.0
Owner Name: Yagyata
Vehicle Type: Motorcycle
Registration Fee: Rs5000.0

After updating registration fee:
Owner Name: Loveleen
Vehicle Type: Car
Registration Fee: Rs6000.0
Owner Name: Yagyata
Vehicle Type: Motorcycle
Registration Fee: Rs6000.0
*/