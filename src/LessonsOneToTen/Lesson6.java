package LessonsOneToTen;

import static jdk.nashorn.internal.objects.NativeArray.length;

public class Lesson6
{
    public static void main(String[] args)
    {
        /**for (/* init ; expression ; increment) {
         * }
         *
         */

        int[] myArray = {100, 34, 21, 16};

        for (int index = 0; index <= 3; index++){

            System.out.println(myArray[index]);
        }

        System.out.println("****************");

        for (int element : myArray){
            System.out.println(element);
        }


    }

}