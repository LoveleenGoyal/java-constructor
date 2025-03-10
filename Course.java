class Course {
    private final String courseName;
    private final int duration;
    private final double fee;
    private static String instituteName = "Tech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: Rs" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method for testing
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 8000.0);
        Course c2 = new Course("Data Science", 12, 12000.0);

        System.out.println("Course details in institute:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        // Update the institute name
        Course.updateInstituteName("Global Tech Institute");

        System.out.println("After updating institute name:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}

/*
Course details in institute:
Institute Name: Tech Academy
Course Name: Java Programming
Duration: 6 months
Fee: Rs8000.0

Institute Name: Tech Academy
Course Name: Data Science
Duration: 12 months
Fee: Rs12000.0

After updating institute name:
Institute Name: Global Tech Institute
Course Name: Java Programming
Duration: 6 months
Fee: Rs8000.0

Institute Name: Global Tech Institute
Course Name: Data Science
Duration: 12 months
Fee: Rs12000.0
*/
