package LessonsOneToTen;

public class Lesson7
{
    public static void main(String[] args)
    {
        String myString = "Hello World ee";
        int myStringLength = myString.length();
        String myStringLowerCase = myString.toLowerCase();
        System.out.println(myStringLength);
        System.out.println(myStringLowerCase);

        System.out.println(myString.replace('e','a'));
        System.out.println(myString.indexOf("W"));

    }

}
