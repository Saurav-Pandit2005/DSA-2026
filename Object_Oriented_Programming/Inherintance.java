package Object_Oriented_Programming;

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

// class fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swim");
//     }
// }

public class Inherintance {
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.breathe();

        Dog Doggy = new Dog();
        Doggy.eat();

        Doggy.legs = 4;
        System.out.println(Doggy.legs);
    }   
}
