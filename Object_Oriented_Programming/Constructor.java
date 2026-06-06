// Constructor

package Object_Oriented_Programming;

class Student {
    String name;
    int age;
    String password;

    // Default Constructor
    // Student() {
    //     System.out.println("Constructor is called....!");
    // }

    // Parametrazied Constructor
    // Student(String name) {
    //     this.name = name;
    // }

    // Student(int age) {
    //     this.age = age;
    // }

    // Copy Constructor
    Student() {
        System.out.println("Constructor is called..!");
    }

    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.password = s1.password;

        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
        System.out.println("Password : " + s1.password);
    }
}

public class Constructor {
    public static void main(String[] args) {

        // Default Constructor
        // Student s1 = new Student();
        // System.out.println(s1);

        // Parametrazied Constructor
        // Student s2 = new Student("Saurav");
        // System.out.println(s2.name);

        // Student s3 = new Student(20);
        // System.out.println(s3.age);

        // Copy Constructor
        Student s1 = new Student();

        s1.name = "Saurav";
        s1.age = 20;
        s1.password ="abcd";

        Student s2 = new Student(s1);
        s2.password = "xyz";
    }
}
