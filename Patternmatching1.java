public class Patternmatching1 {

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
        for(int i=1; i<3; i++){
            System.out.println();
            for(int j=2; j>=i; j--){
                System.out.print("#");
            }
        }
    }
}
