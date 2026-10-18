class appleMobiles{
    static String brand = "iphone"; //static variable
    int storage; //non-static variable
    int ram;
    int price; //non-static variable
    String modelName;

    public void show(){
        System.out.println(brand + " " + modelName + " " + storage + "GB " + ram + "GB " + price);
    }
}
public class staticvar {
    public static void main(String[] args) {
        appleMobiles aM = new appleMobiles();
        aM.storage = 128;
        aM.ram = 16;
        aM.price = 123456;
        aM.modelName = "14 Pro Max";

        appleMobiles aM2 = new appleMobiles();
        aM2.storage = 256;
        aM2.ram = 32;
        aM2.price = 323456;
        aM2.modelName = "17 Pro Max";

        aM.show();
        aM2.show();

        
    }
}
