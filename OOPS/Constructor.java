package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
    
}

class Student{
    String name;
    int rollno;

    // create constructor
    Student(){
        System.out.println("constructor is called");
    }
}
