
class Thiskeyword {

    String name;

    Thiskeyword(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Thiskeyword obj = new Thiskeyword("Ganesh");
        obj.display();
    }
}
