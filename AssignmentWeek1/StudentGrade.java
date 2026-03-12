package AssignmentWeek1;
public class StudentGrade {
    public static void main(String[] args) {
        int marks = 85;
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Very Good"); break;
            case 'C': System.out.println("Good"); break;
            case 'D': System.out.println("Pass"); break;
            case 'F': System.out.println("Fail"); break;
        }
    }
}
