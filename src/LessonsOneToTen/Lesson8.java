package LessonsOneToTen;

public class Lesson8 {

    public static void main(String[] args)
    {
        int sum = Add2(100,245);
        int result = sum * 15;
        System.out.println(sum);
        System.out.println(result);

    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    public static void Add(int a, int b) {
        System.out.println(a + b);
    }
    public static int Add2(int a, int b) {
        return (a + b);
    }

}