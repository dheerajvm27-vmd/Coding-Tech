package AssignmentWeek2;
class AgeException {
    static void checkAge(int age) {
        if(age < 18)
            throw new ArithmeticException("Not eligible for voting");
        else
            System.out.println("Eligible for voting");
    }
    public static void main(String[] args) {
        checkAge(16);
    }
}