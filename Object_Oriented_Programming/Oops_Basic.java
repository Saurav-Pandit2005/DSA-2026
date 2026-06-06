package Object_Oriented_Programming;

// Encapsulation

class Pen {
    // Properties + Function

    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

// class Student {
//     String name;
//     int age;
//     float cgpa;

//     void calcCgpa(int phy, int chem, int math) {
//         cgpa = phy + chem + math / 3;
//     }
// }

// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd;
//     }
// }

public class Oops_Basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();     // Created a pen object called p1

        p1.setColor("pink");
        p1.setTip(7);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        // BankAccount Class

        // BankAccount myAccount = new BankAccount();
        // myAccount.username = "SauravPandit";
        // myAccount.setPassword("abc");
    }
}