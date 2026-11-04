
class Student {

    private int rollNo = 101;

    public void display() {
        System.out.println(rollNo);
    }
}

public class PrivateMod {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}
