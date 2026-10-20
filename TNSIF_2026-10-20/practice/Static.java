class Student {
    String Name;
    static String School;
    static void display() {
        System.out.println(School); // Works
        // System.out.println(name); // Error as static method can't access non static variables 
    }
}



class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    //@Override //Static methods cannot be overridden in the normal polymorphic sense so @Override gives an error
    static void show() {
        System.out.println("Child");
    }
}


class Outer {//A static nested class doesn't need an outer-class object
    static class Inner {
        void display() {
            System.out.println("Hello");
        }
    }
}



public class Static {
    static {//static block even executed before main
        System.out.println("Static block");
    }
    public static void main(String[] args){
        Student.School = "BHS";
        //Student.Name = "Raj"; //This gives an error as its not a static variable
        Student st = new Student();
        Student st2 = new Student();
        System.out.println(st.School == st2.School);//Static variables are shared by every object
        st.Name = "Raj";
        Student.display();
        System.out.println(Student.School + " " + st.Name);
        
        Parent obj = new Child();//Static methods are hidden, not overridden. The method call is resolved using the reference's declared type (Parent), rather than the actual object's type (Child). In real code, call static methods using the class name.
        obj.show();

        Outer.Inner objj = new Outer.Inner();
        objj.display();
    }
}
