package module5;
class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}
class Student {
    String name;
    Teacher teacher;
    Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
public class Associationdemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Nirmal");
        Student s = new Student("Nikhil", t);
        System.out.println(s.name + " is taught by " + s.teacher.name);
    }
}