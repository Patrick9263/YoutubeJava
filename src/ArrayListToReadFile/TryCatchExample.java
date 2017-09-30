package ArrayListToReadFile;
/*
Definition: an exception is an event, which occurs during
the execution of a program, that disrupts the normal
flow of a program's instructions.
 */

public class TryCatchExample {

    public static void main(String[] args){
        int b[]= new int[2];
        try {
            int a = 100/0;
            System.out.println("value of b = "+b[3]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("------------------");
    }

}
