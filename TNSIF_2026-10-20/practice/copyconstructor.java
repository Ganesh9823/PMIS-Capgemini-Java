class Student {
    String name;
    int age;

    // Default constructor

    // Copy constructor
    Student(int age,String name) {
        this.name = name;
        this.age = age;
    }

    // Method to print student information
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class copyconstructor {
    public static void main(String args[]) {
        Student s1 = new Student(12,"futomostan");

        // Creating a copy of s1
        Student s2 = s1;
        s2.printInfo();
    }
}