// Constructor

package Object_Oriented_Programming;

class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Saurav");
        System.out.println(s1.name);
    }
}
