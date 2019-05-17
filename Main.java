import java.io.*;
import java.util.*;

class Front {

    public static <E> void move(ArrayList<E> list, E value) {
        // Accessing each element in the list by using for loop

        for (int i = 1; i < list.size(); i++) {
            // comparing if the index i equals to its value
            if (list.get(i).equals(value)) {
                // if it is equals then putting the value of index i in temp
                E temp = list.get(i);
                // remove the first value of the index
                list.remove(i);
                // then add the value in the list to index 0
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






