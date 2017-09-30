package LessonsOneToTen;

public class Lesson5 {

    public static void main(String[] args) {
        int a = 0;
        while (a <= -1)
        {   System.out.println(a);
            a++;
        }
        System.out.println("*******************************");
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while(b <= -1);
        System.out.println("*******************************");

        System.out.print(harmonic(50));
    }

    //harmonic example
    public static double harmonic(double h) {
        if (h == 1.0){
            return 1.0;
        } else {
            return ((1.0 / h) + (harmonic(h-1.0)));
        }

    }

}