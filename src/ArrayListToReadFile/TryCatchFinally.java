package ArrayListToReadFile;
/*
The finally block always executes when the try block exists.
This ensures that the finally block is executed even if an
unexpected exception occurs.
 */
public class TryCatchFinally {

    public static int retInt() {
        int a = 100;
        try {
            a = a/0;
            return a;
        } catch (ArithmeticException e) {
            System.out.println("Catch called");
            System.out.println(e);
            return a;
        } finally {
            a = 5000;
            System.out.println("Finally called");
            return a;
        }
    }

    public static void main(String[] args){
        System.out.println(retInt());

    }

}
