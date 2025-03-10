class Person {
    private final String name;
    private final int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor (Cloning another Person object)
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display Method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an original person object
        Person p1 = new Person();
        System.out.println("Original Person 1: ");
        p1.display();
        Person p2 = new Person("Loveleen", 21);
        System.out.println("Original Person 2: ");
        p2.display();

        // Creating a new person object by copying p1
        Person p3 = new Person(p1);
        System.out.println("Copied Person: ");
        p3.display();
        p3 = new Person(p2);
        System.out.println("Another copied Person: ");
        p3.display();
    }
}
 /*     Original Person 1:
        Name: Unknown, Age: 0
        Original Person 2:
        Name: Loveleen, Age: 21
        Copied Person:
        Name: Unknown, Age: 0
        Another copied Person:
        Name: Loveleen, Age: 21
        */