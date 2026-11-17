class Button {
    void click() {
        System.out.println("Button clicked");
    }
}
class ImageButton extends Button {//single level inheritance
    void click() {
        super.click();
        System.out.println("Image Button clicked");
    }
    
}
class newButton extends ImageButton {//multilevel inheritance
    void click() {
        super.click();
        System.out.println("New Button clicked");
    }
}

// class Bank {
//     int rateOfInterest;
// }

// class HDFC extends Bank {//hierarchical inheritance
    
// }

// class INDB extends Bank {//hierarchical inheritance
    
// }
// class BOB extends Bank {//hierarchical inheritance
    
// }
// class Kotak extends Bank {//hierarchical inheritance
    
// }
// class Kotak811 extends Kotak {//hybrid inheritance
    
// }

public class inheritance {
    public static void main(String[] args) {
        // HDFC hdfc = new HDFC();
        // INDB indb = new INDB();
        // BOB bob = new BOB();
        // Kotak kotak = new Kotak();
        // Kotak811 kotak811 = new Kotak811();
        // hdfc.rateOfInterest = 7;
        // indb.rateOfInterest = 8;
        // bob.rateOfInterest = 9;
        // kotak.rateOfInterest = 10;
        // kotak811.rateOfInterest = 11;
        
        // System.out.println("Rate of Interest in HDFC: " + hdfc.rateOfInterest + "%");
        // System.out.println("Rate of Interest in INDB: " + indb.rateOfInterest + "%");
        // System.out.println("Rate of Interest in BOB: " + bob.rateOfInterest + "%");
        // System.out.println("Rate of Interest in Kotak: " + kotak.rateOfInterest + "%");
        // System.out.println("Rate of Interest in Kotak811: " + kotak811.rateOfInterest + "%");

        newButton nb = new newButton();
        nb.click();
    }
}
