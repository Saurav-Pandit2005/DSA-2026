package Object_Oriented_Programming;

// Single Inherintance

// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathe");
//     }
// }

// class fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swim");
//     }
// }

// public class Inherintance {
//     public static void main(String[] args) {
//         fish shark = new fish();
//         shark.breathe();
//     }   
// }

// ------------------------------------------------------------

// Multi Level Inherintance

// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathe");
//     }
// }

// class Mammal extends Animal {
//     int legs;
// }

// class Dog extends Mammal {
//     String breed;
// }

// public class Inherintance {
//     public static void main(String[] args) {

//         Dog Doggy = new Dog();
//         Doggy.eat();

//         Doggy.legs = 4;
//         System.out.println(Doggy.legs);
//     }  
// }

// ------------------------------------------------------------

// Hierarchical Inheritance

class Animal {
    String color;

    void animal() {
        System.out.println("Animals..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bark..");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowww....");
    }
}

public class Inherintance {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.bark();

        Cat c1 = new Cat();
        c1.meow();
    }
}
