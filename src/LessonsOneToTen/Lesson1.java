package LessonsOneToTen;

import java.util.Scanner;

public class Lesson1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Some Number:");
        int UserInput = scan.nextInt();
        System.out.println("The entered value is:");
        System.out.println(UserInput);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Some Decimal Number:");
        double UserInputX2 = scan1.nextDouble();
        System.out.println("The entered double value is:");
        System.out.println(UserInputX2);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter Some Text:");
        String UserInputTxt = scan2.nextLine();
        System.out.println("The entered text is:");
        System.out.print(UserInputTxt);

    }
}
