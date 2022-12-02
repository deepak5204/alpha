package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        SchoolStudent s1 = new SchoolStudent();
        s1.name="deepak";
        SchoolStudent.schoolName = "DAV";

        SchoolStudent s2 = new SchoolStudent();
        s2.name="ranjit";
        System.out.println(SchoolStudent.schoolName);
    }
    
}

class SchoolStudent{
    String name;
    int roll;

    static String schoolName;

    //setters
    void setName(String name){
        this.name = name;
    }

    //getters
    String getName(){
        return this.name;
    }
}
