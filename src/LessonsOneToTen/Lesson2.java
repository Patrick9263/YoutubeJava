package LessonsOneToTen;

public class Lesson2
{
    public static void main(String[] args)
    {   int x, y, a, b, answer, remainder;
        x = 10;
        x += 5; // x = x+5
        System.out.println(x);

        a = 70;
        b = 30;
        answer = a / b;
        remainder = a % b;

        System.out.println("Answer = " + answer + " R" + remainder);
    }

}