package ArrayListToReadFile;
import java.util.*;
//Lists can contain duplicates, sets can only have unique values.

public class HashSetExample {

    public static void main(String[] args){
        HashSet<String> name = new HashSet<String>();
        name.add("Mark");
        name.add("tom");
        name.add("jack");
        name.add("july");
        name.add("patrick");

        Iterator<String> itr = name.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }

}
