package Lessons11To13;
//method overloading
public class Lesson11
{
    public static void main(String[] args) {
        System.out.println(Add(1,36));
        System.out.println(Add(1.26,36.6549));
        System.out.println(Add("Hello"," world"));
    }

    public static int Add (int a, int b){
        return (a+b);
    }

    public static double Add (double a, double b){
        return (a+b);
    }

    public static String Add (String a, String b){
        return (a+b);
    }


}
