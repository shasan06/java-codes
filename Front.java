import java.io.*;
import java.util.*;

public class Front {
    public static <E> void move(ArrayList<E> list, E value) {

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                E temp = list.get(i);
                list.remove(i);
                list.add(0, temp);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Bob");
        lst.add("Bertie");
        lst.add("Bob");
        lst.add("Chad");
        System.out.println(lst);
        move(lst, "Bob");
        System.out.println(lst);
        move(lst, "Chad");
        System.out.println(lst);
    }
}







