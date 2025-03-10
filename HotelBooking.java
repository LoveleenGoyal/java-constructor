class HotelBooking {
    private final String guestName;
    private final String roomType;
    private final int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        // Default Booking
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBooking();

        // Custom Booking
        HotelBooking booking2 = new HotelBooking("Loveleen", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        booking2.displayBooking();

        // Cloned Booking using Copy Constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nCloned Booking:");
        booking3.displayBooking();
    }
}
/*
Default Booking:
Guest: Unknown, Room Type: Standard, Nights: 1

Custom Booking:
Guest: Loveleen, Room Type: Deluxe, Nights: 3

Cloned Booking:
Guest: Loveleen, Room Type: Deluxe, Nights: 3
*/