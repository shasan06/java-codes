import java.io.*;
import java.util.*;

public class Q1Improved {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (k <= 0) {
            System.out.println("Out of bounds");
        }
        for (int i = 0; i < 12; i++) {
            if (k <= day[i]) {
                System.out.println(months[i]);
                return;
            }
            k -= day[i];
        }
        System.out.println("Out of bound");
    }
}




