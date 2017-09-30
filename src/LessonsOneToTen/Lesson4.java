package LessonsOneToTen;

public class Lesson4 {

    public static void main(String[] args)
    {
        int score = 80;

        // byte, short, int, or char.
        switch (score)
        {
            case 100 :
            case 90 :
                System.out.println("Very good.");
                break;
            case 80 :
            case 60 :
                System.out.println("Good.");
                break;
            case 40 :
                System.out.println("Okay.");
                break;
            default :
                System.out.println("The grades are not defined.");
        }


    }

}
