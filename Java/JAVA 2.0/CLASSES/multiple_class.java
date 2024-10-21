class Student{
    int rollno;
    String name;
}
public class multiple_class {
    public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.rollno = 107;
    s2.rollno = 108;

    s1.name = "faziel";
    s2.name = "nadeem";

    System.out.println(s1.name + s1.rollno + s2.rollno + s2.name);
    }
}
