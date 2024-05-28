package OOPS;

/*
    # C++ provides default copy constructor
    # In java we need create COPY CONSTRUCTOR
    # COPY CONSTRUCTOR- It copy all properties from one constructor to another constructor
 */

//  public class CopyConstructor{
//     public static void main(String[] args) {
//         City c1 = new City();

//         c1.name = "Gurgaon";
//         c1.state = "Haryana";
//         c1.size = "732km^2";

//         // c1.printCityInfo();

//         City c2 = new City(c1, "Faridabad", "189km^2");
//         c2.printCityInfo();

//     }
// }

// class City{
//     String name;
//     String state;
//     String size;

//     public void printCityInfo(){
//         System.out.print(this.name +" "+ this.state + " " + this.size);
//     }

//     City(){
//         System.out.println("Constructor called");
//     }

//     City(City c, String name, String size){
//         this.name = name;
//         this.state = c.state;
//         this.size = size;
//     }
// }

public class CopyConstructor {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        s1.name = "deepak";
        s1.rollno = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        System.out.println(s1.name);
        System.out.println(s1.rollno);

        Student2 s2 = new Student2(s1);
        s2.password = "defg";

        s1.marks[2] = 100; // it affect the marks of s2 because copy only reference of array

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

}

class Student2 {
    String name;
    int rollno;
    String password;
    int marks[];

    // // shallow copy constructor
    // Student2(Student2 s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollno = s1.rollno;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student2(Student2 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student2() {
        marks = new int[3];
        System.out.println("constructor is called");
    }

    Student2(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student2(int rollno) {
        marks = new int[3];
        this.rollno = rollno;
    }

}
