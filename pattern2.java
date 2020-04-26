import java.util.Scanner;

public class pattern2{
    /*public static void main(String[] args) {

        int i, space=4, j, stars=1;
        for(i=1; i<=5; i++){

            for(j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            space--;
            stars+=2;
        }
    }*/

    //******// the above code is hard coded let us see what patterns do we get if the above code is done by the user input

    /*public static void main(String[] args) {
        int i,j;
        Scanner in = new Scanner(System.in);
        int space = in.nextInt();
        int stars = in.nextInt();

        for(i=1; i<=5; i++){
            for(j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            space--;
            stars+=2;

        }*/

    //**// do some rhombus loose coupled

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1; i<=n; i++){
          //j=space
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int stars=1; stars<=(2*i-1); stars++){
                System.out.print("*");
            }
            System.out.println();// till here is the pattern loose couple, now proceed for rhombus
        }
        for(int i=n-1; i>=1; i--){

            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int stars=1; stars<=(2*i-1); stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





