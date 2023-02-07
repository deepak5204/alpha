package OOPS;



/*
    default constructor call when other constructor is not defined

 */

 
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // call Non-parameterized constructor
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        Student s2 = new Student("deepak"); // call Parameterized constructor
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        Student s3 = new Student(124);
        System.out.println(s3.name);
        System.out.println(s3.rollno);
    }
    
}

class Student{
    String name;
    int rollno;

    // create constructor
    Student(){ // itis non - parametrized constructor
        System.out.println("constructor is called");
    }

    // create parametrized constructor
    Student(String name){
        this.name = name;
    }

    // create parametrized constructor
    Student(int rollno){
        this.rollno = rollno;
    }
}
