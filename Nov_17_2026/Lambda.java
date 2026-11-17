
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        // Create a list of students
        List<Student> list = new ArrayList<>();

        // Add student details
        list.add(new Student("Ganesh", 101, 55));
        list.add(new Student("Ramesh", 102, 90));
        list.add(new Student("Suresh", 103, 75));
        list.add(new Student("Mahesh", 104, 28));

        // Sort students by marks (highest to lowest)
        Collections.sort(list,
                (s1, s2) -> Integer.compare(s2.marks, s1.marks)
        );

        // Display student details
        for (Student s : list) {
            System.out.println(
                    "Name: " + s.name
                    + ", Roll No: " + s.rollNo
                    + ", Marks: " + s.marks
            );
        }
    }
}

// Student class
class Student {

    String name;
    int rollNo;
    int marks;

    // Constructor
    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
