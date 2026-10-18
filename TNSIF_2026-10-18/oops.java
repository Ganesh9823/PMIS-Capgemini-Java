class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
}
class Student {
    String name;
    int age;
    int rollNo;


    Student(){
        System.out.println("This is a default constructor");
    }
    Student(String name, int age, int rollNo){          //constructor overloading
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public void study(){
        System.out.println(this.name + " is studying");
        System.out.println("His/Her age is " + this.age);
        System.out.println("His/Her roll number is " + this.rollNo);
    }
}


public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.color = "Red";           //to access properties of an object we use "."
        p1.type = "Ballpoint";
        p2.color = "Black";
        p2.type = "Gel";
        p1.write();
        p2.write();
        Student s1 = new Student("John", 20, 101);
        Student s2 = new Student();
        s1.study();
    }
}


// Modifier	              Same class	Same package	Different package subclass	Different package non-subclass
// public	                 Yes	       Yes	                    Yes	                         Yes
// protected	             Yes	       Yes	                    Yes*	                      No
// Default (no modifier)	 Yes	       Yes	                     No	                          No
// private	                 Yes	        No	                     No	                          No