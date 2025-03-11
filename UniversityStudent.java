class Students {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Students(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        if (newCGPA > 0.0 && newCGPA < 10.0) {
            CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Students {
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Display postgraduate student details
    public void displayPostgraduateStudent() {
        System.out.println("Postgraduate Student Details:");
        displayStudent();
    }
}

public class UniversityStudent {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Loveleen", 8.5);
        System.out.println("Student Details: ");
        s1.displayStudent();

        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgS1 = new PostgraduateStudent(201, "Yagyata", 8.9);
        System.out.println();
        pgS1.displayPostgraduateStudent();

    }
}

/*
Student Details:
Roll Number: 101
Name: Loveleen
CGPA: 8.5
Updated CGPA: 9.2

Postgraduate Student Details:
Roll Number: 201
Name: Yagyata
CGPA: 8.9
* */