import java.util.Scanner;

public class Circle {
    public double pi = Math.PI;
    private double radius;

    // Default Constructor and chaining it to parameterized constructor
    public Circle() {
        this(3.14);
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double calculateArea(double radius) {
        return pi * radius * radius;
    }

    // Method to display area of circle
    public void displayCircleArea() {
        System.out.println("Area Of Circle: " + calculateArea(radius));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle1 = new Circle();

        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        Circle circle2 = new Circle(radius);

        // Display the results
        System.out.println("Circle 1: ");
        circle1.displayCircleArea();
        System.out.println("Circle 2: ");
        circle2.displayCircleArea();

        sc.close();
    }
}
/*
Enter the radius of circle:
7.14
Circle 1:
Area Of Circle: 30.974846927333928
Circle 2:
Area Of Circle: 160.1571368429462
*/