package ArrayListToReadFile;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){
        LinkedList<String> name = new LinkedList<String>();
        name.add("Patrick");
        name.add("Mark");
        name.add("Tom");
        name.add("John");
        name.addFirst("Jack");
        name.addLast("Zack");
        System.out.println(name.size());
        //name.removeLast();
        //name.removeFirst();
        //name.clear();
        name.add(1,"index1");
        name.remove(1);
        name.set(2,"mark");

        for (String x : name)
            System.out.println(x);
    }
}