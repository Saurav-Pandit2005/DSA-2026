package Object_Oriented_Programming;

//   Compile-Time Polymorphism (Method Overloading)
        
// class Calculator {
//     int sum(int a, int b) {
//         return a+b;
//     }

//     float sum(float a, float b) {
//         return a+b;
//     }

//     int sum(int a, int b, int c) {
//         return a+b+c;
//     }
// }

// public class Polymorphism {
//     public static void main(String[] args) {
//         Calculator c1 = new Calculator();
//         System.out.println(c1.sum(20, 30));
//         System.out.println(c1.sum((float)31.5, (float)18.5));
//         System.out.println(c1.sum(20, 30, 50));
//     }
// }

// -----------------------------------------------------------------------------------

// Runtime Polymorphism (Method Overriding)

class Animal {
    void eat() {
        System.out.println("eats anything..");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eat grass..");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}
