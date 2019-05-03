import java.io.*;
import java.util.*;
public class MonthQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";
        //for (int i = 0; i < months.length; i++) {
            if (k >= 1 && k <= 31) {
                System.out.println(months[0]);
            }
            else if(k>=32 && k<=59){
                System.out.println(months[1]);
            }
            else if(k>=60 && k<=90){
                System.out.println(months[2]);
            }
            else if(k>=91 && k<=120){
                System.out.println(months[3]);
            }
            else if(k>=121 && k<=151){
                System.out.println(months[4]);
            }
            else if(k>=152 && k<=181){
                System.out.println(months[5]);
            }
            else if(k>=182 && k<=212){
                System.out.println(months[6]);
            }
            else if(k>=213 && k<=243){
                System.out.println(months[7]);
            }
            else if(k>=244 && k<=273){
                System.out.println(months[8]);
            }
            else if(k>=274 && k<=304){
                System.out.println(months[9]);
            }
            else if(k>=305 && k<=334){
                System.out.println(months[10]);
            }
            else if(k>=335 && k<=365){
                System.out.println(months[11]);
            }
            else{
                System.out.println("Out of bounds");
            }
        }
    }







