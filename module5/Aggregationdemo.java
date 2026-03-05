package module5;
class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}
class College {
    String collName;
    Department dept;   // Aggregation (has-a)

    College(String collName, Department dept) {
        this.collName = collName;
        this.dept = dept;
    }
    void display() {
        System.out.println(collName + " has department: " + dept.deptName);
    }
}
public class Aggregationdemo {
    public static void main(String[] args) {
    Department d = new Department("Computer Science");
        College c = new College("Sapthagiri", d);
    c.display();
    }
}