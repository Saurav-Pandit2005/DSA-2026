package Object_Oriented_Programming;

// Shallow Copy

// class Address {
//     String city;
    
//     Address(String city) {
//         this.city = city;
//     }
// }

// class Student {
//     String name;
//     Address address;

//     Student(String name, Address address){
//         this.name = name;
//     }

//     // Shallow Copy Constructor
//     Student (Student s) {
//         this.name = s.name;
//         this.address = s.address;       // same refrences
//     }
// }

// public class Shallow_and_Deep_Copy {
//     public static void main(String[] args) {
//         Address adr = new Address("Rajkot");
//         Student s1 = new Student("Saurav", adr);
//         Student s2 = new Student(s1);   // shallow copy

//         s2.address.city = "Mumbai";            // change both
//         System.out.println(s2.address.city);   // Output : Mumbai 
//     }
// }

// ---------------------------------------------------------------------------------------------------------

// Deep Copy

// class Address {
//     String city;
//     Address(String city) {
//         this.city = city;
//     }

//     // Copy constructor for Address
//     Address(Address a) {
//         this.city = a.city;
//     }
// }

// class Student {
//     String name;
//     Address address;

//     Student(String name, Address address) {
//         this.name = name;
//         this.address = address;
//     }

//     // Deep copy constructor
//     Student(Student s) {
//         this.name = s.name;
//         this.address = new Address(s.address); // new object
//     }
// }

// public class Shallow_and_Deep_Copy {
//     public static void main(String[] args) {
//         Address addr = new Address("Delhi");
//         Student s1 = new Student("Saurav", addr);
//         Student s2 = new Student(s1); // deep copy

//         s2.address.city = "Mumbai";  // changes only s2
//         System.out.println(s1.address.city); // Output: Delhi
//         System.out.println(s2.address.city); // Output: Mumbai
//     }
// }