package AssignmentWeek2;
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
class Test {
    static void check(int num) throws MyException {
        if(num < 0)
            throw new MyException("Number is Negative");

        else
            System.out.println("Valid Number");
    }
    public static void main(String[] args) {
        try {
            check(-5);
        }
        catch(MyException e) {
            System.out.println(e);
        }
    }
}
