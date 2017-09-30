package ArrayListToReadFile;
import java.util.ArrayList;
public class ArrayListExample {

    public static void main(String[] args){
        int simple_array[] = new int[5] /* or {1,2,3,4,5}*/;

        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(1);
        myList.add(5);
        myList.add(31);
        myList.add(42);
        myList.add(56);

        for (Integer x : myList)
            System.out.println(x);

        System.out.println("The size is: " +myList.size());

        myList.remove(2);
        System.out.println(myList);
        System.out.println("The size is: " +myList.size());

        myList.set(0, 100);
        System.out.println(myList);

        myList.trimToSize();

        myList.clear();
        System.out.println(myList);
        System.out.println("The size is: " +myList.size());
    }
}