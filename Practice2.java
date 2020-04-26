/*public class Practice2{
    public static void main(String[] args){
        int age = 21;
        System.out.println(age);
    }
}*/

/*class Practice2{
    public static void main(String[] args) {
        boolean isTrue = false;
        double money = 99999.99;
        System.out.println(money);
        System.out.println(isTrue);
    }
}
*/

/*class Practice2{
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            System.out.println();
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
        }
        for(int i=1; i>=0; i--){
            System.out.println();
            for(int j=0; j<=i; j++){
                System.out.print("#");
            }
        }
    }
}
 */

/*class Practice2{
    public static void main(String[] args) {
        String name = "Timmy";
        System.out.println(name.length());
    }
}*/

/*class Practice2{
    public static void main(String[] args) {
       String str = "boopity bop";
       System.out.print(str.charAt(5));
       System.out.print(str.charAt(8));
       System.out.print(str.charAt(1));
       System.out.print(str.charAt(str.length()-1));//the last letter of the string
    }
}*/

/*class Practice2{
    public static void main(String[] args) {
        String s = "banana";
        for(int i=0; i<s.charAt(3);i++){
            System.out.println(s.substring(i));
            //System.out.print(i);
        }

    }
}*/

/*class Practice2{
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(s.substring(0,3));

        }
    }
*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("In: ");
        String str=sc.nextLine();
        System.out.println(str.substring(0,3));

    }
}*/

//import java.util.Scanner;

//timeDecomp that given a natural number of seconds n, prints the number of hours, minutes and seconds represented by n.
/*class Practice2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(timeDecomp(n));


    }
        public static String timeDecomp(int seconds)
        {
            String l ="";
            int h = seconds/3600;
            int m = seconds/60%60;
            int s = seconds%60;

            return " " + h + " " + m + " " + s;


        }
}*/

/*class Practice2{
    public static void main(String[] args) {
            int [] array = new int[]{10,20,30,40,50};
            //declaration of Array, initializing and doing assignment
            for(int i =0; i<array.length; i++){
                System.out.println(array[i]);
            }
    }
}*/

/*class Practice2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(SumElement(a));
    }

    public static int SumElement(int [] n){
        int sum=0;
        for(int i=0; i<n.length; i++){
            sum+=n[i];
        }
        return sum;
    }

}*/


/*class Practice2{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        for(int e : a){
            System.out.print(e + " ");
        }
    }

    public static void mystery(int[] array){

        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                array[i] = array[i]/2;
            }
            else{
                array[i] = array[i]*10;
            }
        }




    }
}*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5]; //declare an array, save it in memory [5] and then assign it

        //System.out.println(arr);
        //System.out.println(arr[i]);

        for(int i=0; i<5; i++) {
            arr[i] = input.nextInt();
        }

        for(int elem : arr){
            System.out.println(elem*10);
        }


    }

}*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i]=in.nextInt();
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

    }
}*/

/*class Practice2 {
    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(minValue(arr));
    }

    public static int minValue(int[] nums) {
        int min = 999999;

        for (int elem : nums) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

}*/

//3/1
/*import java.util.Scanner;
class Practice2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        int num = inp.nextInt();
        if(num>0){
            System.out.println(num +" is positive");
        }
        else if(num<0){
            System.out.println(num + " is negative");
        }
        else{
            System.out.println(num +" is zero");
        }
        //System.out.println(num);
    }
}*/
//3/2

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd");
        }
    }
}*/

//3/3

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        String name = input.nextLine();
        if(name.equals("Chen")){
            System.out.println("teacher");
        }
        else{
            System.out.println("student");
        }
    }
}*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int end = input.nextInt();
        for(int i=1; i<=end; i++){
            System.out.print(i+" ");
        }

    }
}*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int end = input.nextInt();
        for(int i=0; i<end*2; i++){
            System.out.print(i+" ");
        }
    }
}*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        String word = input.nextLine();
        for(int i=0; i<word.length(); i++){
            System.out.println(word.substring(i,i+1));
        }
    }
}*/

/*import java.util.Scanner;

class Practice2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("In: ");
        String word = in.nextLine();
        for(int i=0; i<word.length(); i+=2)
        {
         System.out.print(word.charAt(i));
        }





    }
}*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("In: ");
        String word = in.nextLine();
        for(int i=0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
            || ch == 'O' || ch == 'U'){
                System.out.print(ch);
            }
        }
    }
}*/

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int x = input.nextInt();
        for(int i=0; i<x; i+=3){
            System.out.print(i+ " ");
        }
    }
}
*/ //3/9

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int x = input.nextInt();
        for(int i=x-1; i>=0; i--){
            System.out.print(i+" ");
        }
    }
}*/
//3/10

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In: ");
        String s = input.nextLine();
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i)+ " ");
        }
    }
}
*/
//3/11

/*import java.util.Scanner;

class Practice2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In: ");
        String s = in.nextLine();
        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}*///3/12

/*import java.util.Scanner;

//3/13
class Practice2{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("In: ");
      int x = in.nextInt();
      int first  = 0;
      int second = 1;



      for(int i=2; i<=x; i++)
      {

      }
    }
}*/

/*import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("In: ");
        int x = in.nextInt();
        int a=0, b=1;
        for(int i=1; i<=x; i++)
        {
            System.out.print(a+" ");
            int c = a + b;
            a=b;
            b=c;

        }

    }
}*/
//3/13

/*import java.util.Scanner;

class palindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("In: ");
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            for (int j = s.length(); j >= 0; j--) {
                char n = s.charAt(j);
                {
                    if (m == n) {
                        System.out.println();
                    }
                }
            }
        }
    }
}*/

//check to see if its a palindrome

/*import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("In: ");
        String s = in.nextLine();
        String m = s.toLowerCase();//original string
        m=m.replaceAll("\\s","");
        String reverse="";

        for(int i=m.length()-1; i>=0; i--)
        {
            reverse = reverse + m.charAt(i);

            //System.out.println(reverse);
        }
        if(m.equals(reverse)){
            System.out.println("true");
        }
    }
}*/
//3/14

//3/15
/*class Practice2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("num1: ");
        //System.out.print("num2: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum=0;
        for(int i=num2; i>=num1; i--)
        {
            //System.out.println(i);
            if(i%2==1)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}*/

//4/4

/*class Practice2 {
    public static void main(String[] args) {
        //String name;
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(bothEven(num1, num2));
    }

    public static boolean bothEven(int a, int b)
    {
        if (a % 2 == 0 && b % 2 == 0) {
            return true;
        }
        return false;
    }
}*/

//4/5

/*class Practice2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(sumFivesRange(a,b));
    }

    public static int sumFivesRange(int num1, int num2)
    {
        int sum=0;
        for(int i=num1; i<=num2; i++){
            if(i%5==0){
                sum+=i;
            }
            //return sum;
        }
        return sum;
    }
}*/

//4/6

/*class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String m = s.replaceAll("\\s", "");
        //String n="";
        System.out.println(keepVowels(m));
    }
    }

    public static String keepVowels(String l) {
        for (int i = 0; i < l.length(); i++)
        {
            //String n="";
            char ch = l.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.print(ch);
            }


        }
        return "";
    }
}*/

//4/7


/*class Practice2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(spaceOut(s));

    }
    public static String spaceOut(String s)
    {
        String w="";
        for(int i=0; i<s.length(); i++)
        {
            w+=s.substring(i,i+1) + " ";
        }
        return w;
    }
}
*/

//4/8

/*class Practice2{
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", 'c'));
    }
    public static String surround(String s, char search_term)
    {
        String w="";
        for(int i=0; i<s.length(); i++)
        {
            //if(s.substring(i,i+1).equals(search_term)){
            if(s.charAt(i)==(search_term)){
                w+="("+s.substring(i,i+1)+")";
            }
            else{
                w+=s.substring(i,i+1);
            }
        }
        return w;
    }
}*/

//4/9

/*class Practice2{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Goofy","Beagle",65);
        Dog myDog1= new Dog("Snuffy",50);
        System.out.println(myDog.name+", "+myDog.breed+", "+myDog.weight);
        System.out.println(myDog1.name+", "+myDog1.breed+", "+myDog1.weight);

    }
    public static class Dog{
        String name;
        String breed;
        int weight;

        public Dog(String name, String breed, int weight)
        {
            this.name=name;
            this.breed=breed;
            this.weight=weight;
        }

        public Dog(String name, int weight)
        {
            this.name=name;
            this.breed="Mutt";
            this.weight=weight;

        }

    }

}*/

//palindrome different way
/*class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isPallindrome(s));
    }
        public static boolean isPallindrome (String n) {
            for (int i = 0; i < n.length() / 2; i++) {
                if (n.charAt(i) == (n.charAt(n.length() - 1 - i))) {
                    return true;
                }
            }
        return false;

        }
}*/

/*class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean flag=true;//this means if all is true then this is triggered

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != (s.charAt(s.length() - 1 - i))) {
                flag=false;
            }
        }
        System.out.println(flag);


    }
}*/

//ENCAPSULATION
/*class Person{
    public static void main(String[] args) {
        Person thePerson = new Person("Sabrina","Hasan",7,9,1993, "ssp");
        System.out.println(thePerson.getFirstname());
        System.out.println(thePerson.getLastname());
        System.out.println(thePerson.getBirthday());
        System.out.println(thePerson.verifySSN("ssp"));
        System.out.println(thePerson.verifySSN("sdp"));
        thePerson.setFirstname("tee");
        System.out.println(thePerson.getFirstname());

    }
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
        this.ssn=ssn;
    }

    public String getFirstname()
    {
        return this.firstname;
    }
    public String getLastname()
    {
        return this.lastname;
    }
    public String setFirstname(String firstname)
    {
        return this.firstname=firstname;
    }
    public String setLastname(String lastname)
    {
        return this.lastname=lastname;
    }
    public String getBirthday()
    {
        String bd="";
        return bd=bd+this.birthmonth+"/"+this.birthday+"/"+this.birthyear;
    }
    public boolean verifySSN(String ssn)
    {
        return this.ssn==ssn;
    }
}*/

//count min vowel
/*class Practice2{
    public static void main(String[] args)
    {
        String[]arr= {"hey","yolo","hi","this is long"};
        System.out.println(minVowels(arr));
    }

    public static String minVowels(String [] word) {
        String w = "aaaaaaaaaaaaaaaaaaaa";
        int nvw = 20;

        for (int i = 0; i < word.length; i++) {

            int count = noOfVowel(word[i]);
            if (nvw > count) {
                nvw = count;
                w = word[i];
            }
            else if(count==nvw){
                if(word[i].length()<w.length()){
                    w=word[i];
                }
            }

        }return w;
    }
    public static int noOfVowel(String s){
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }return count;

    }

    public static boolean isVowel(char ch)
    {
       return ch =='a'||
              ch == 'e'||
              ch == 'i'||
              ch == 'o'||
              ch == 'u'||
              ch == 'A'||
              ch == 'E'||
              ch == 'I'||
              ch == 'O'||
              ch == 'U';
    }

}*/

//Q17 ArrayLISTal1-3

/*import java.util.ArrayList;

class Practice2{

    public static ArrayList<String>test()
    {
        ArrayList<String> names = new ArrayList<String>();
        //declaration              //initialization
        names.add("Ahla");
        names.add("Sabrina");
        names.add("Ali");
        names.add("Saim");

        return names;
    }

    public static void main(String[] args) {
        System.out.println(test());//print the test method
    }
}*/

//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Practice2{
//    public static void main(String[] args) {
//        ArrayList<String> words = new ArrayList<String>(Arrays.asList("Ahla","Sabrina","Saim","Anamta"));
//        /*words.add("Ahla");
//        words.add("Sabrina");
//        words.add("Saim");
//        words.add("Anamta");*/
//
//        System.out.println(test(words));
//    }
//    public static ArrayList<String> test(ArrayList<String> words)
//    {
//        words.set(0,"git");
//        words.set(2,"gud");
//        return words;
//    }
//}Checked in Test 1

import java.util.*;

//Al-4 Q14
/*class Practice2{
    public static int test(ArrayList<Integer> ints){
        int sum=0;
        for(int i=0; i<ints.size(); i++){
            sum+=ints.get(i);
        }return sum;
    }
    // we can do this testing

    public static void main(String [] args){
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for(int i=1; i<10; i++){
            ints.add(i);
        }
        System.out.println(test(ints));
    }



}*/

//AL-5 Q15
/*class Practice2{
    public static void main(String[] args) {

        ArrayList<Double> ints = new ArrayList(Arrays.asList(1.0, 2.0,3.0,4.0,5.0));
        test(ints);
        System.out.println(ints);

    }
    public static void test(ArrayList<Double> dubs)
    {

        {
            dubs.remove(0);
            dubs.remove(0);
        }
    }
}*/

//AL6
/*class Practice2{
    public static void main(String[] args) {
        //ArrayList<String> strings = new ArrayList(Arrays.asList("hello, hi, good, bye, bad")); why is thgis piece of code not working , may be for fixed index
        ArrayList<String> strings = new ArrayList<String>();
        for(int i =0; i<10; i++){
            strings.add(i,"Hello");
        }
        System.out.println(strings);
        test(strings);
        System.out.println(strings);
    }
    public static void test(ArrayList<String>words)
    {
        words.add(0,"hey");
        words.add(3,"yo");
    }
}
*/

//AL7
/*class Practice2{
    public static void main(String[] args) {
        ArrayList<String> wordList1 = new ArrayList(Arrays.asList("hello, good, better, best, worst"));
        ArrayList<String> wordList2 = new ArrayList(Arrays.asList("hi, why, go"));
        System.out.println(combineAl(wordList1, wordList2));
    }

    public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2)
    {
        ArrayList<String> combinewords = new ArrayList<String>();
        combinewords.addAll(wordList1);
        combinewords.addAll(wordList2);
        return combinewords;
    }
}*/

//Al8

/*class Practice2{
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList(Arrays.asList("hello", "good", "better", "best", "worst"));
        String targetWord = "better";
        removeAll(wordList,targetWord);
        System.out.println(wordList);

    }

    public static void removeAll(ArrayList<String> wordList, String targetWord){
        for(int i=0; i<wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove((targetWord));
            }
        }
    }
}*/
//Al8 Same question use index of methof to achieve the desired result

/*class Practice2{
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList(Arrays.asList("hello", "good", "better", "best", "worst"));
        String targetWord = "better";
        removeAl(wordList, targetWord);
        System.out.println(wordList);

    }

    public static void removeAl(ArrayList<String> wordList, String targetWord)
    {
        for(int i=0; i<wordList.size(); i++){
            while(wordList.indexOf(targetWord)>=0){
                wordList.remove(wordList.indexOf(targetWord));
            }
        }
    }
}*/

//Al-9
/*class Practice2{
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(ints));

    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> ints){
        ArrayList<Integer> ints1 = new ArrayList<>();
        int sum=0;
        for(int i=0; i<ints.size(); i++){

            if(ints.get(i)>0){
                ints1.add(ints.get(i));

                sum+=ints.get(i);

            }




        }


        ints1.add(sum);
        return ints1;
    }
}
*/

//Al-10

/*class Practice2{
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        timesTwo(nums1);
        System.out.println(nums1);
    }

    public static void timesTwo(ArrayList<Integer> nums)
    {

        for(int i=0; i<nums.size(); i++){
             nums.set(i,2*nums.get(i));
        }
    }
}
*/

//Al-11

/*class Practice2{
    public static void main(String[] args) {
        ArrayList<Boolean> values1 = new ArrayList<>(Arrays.asList(true,false,false));
        repeatAl(values1);
        System.out.println(values1);

    }

    public static void repeatAl(ArrayList<Boolean> values)
    {
        int size1 = values.size(); // size is till 3 so that the for loop works till three
        for(int i=0; i<size1; i++)
        {
            values.add(values.get(i));
        }
    }
}
*/

//Al-12

/*class Practice2{
    public static void main(String[] args) {

        ArrayList<Integer> int1 = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(timesTwo(int1));
    }

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> ints)
    {
        ArrayList<Integer> values = new ArrayList<>();
        for(int i=0; i<ints.size(); i++){
            values.add(ints.get(i));
            values.add(ints.get(i));
        }
        return values;
    }
}

*/
//Al-13

/*class Practice2{
    public static void main(String[] args) {
        ArrayList<String> words1 = new ArrayList(Arrays.asList("hi","yo","sup","yolo","boop"));
        removeEveryOther(words1);
        System.out.println(words1);

    }

    public static void removeEveryOther(ArrayList<String> words){
        for(int i=0; i<words.size(); i+=1){
            words.remove(words.get(i));
        }
    }
}
*/

//R1
/*class Practice2{
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 8;
        System.out.println(max(a,b,c));
    }

    public static String max(int a1, int b1, int c1)
    {
        if(a1>b1 && a1>c1){
            return String.valueOf(a1);
        }
        else if(b1>c1){
            return String.valueOf(b1);
        }
        else{
            return String.valueOf(c1);
        }
    }
}
*/


//R-2

/*class Practice2{
    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "abcde";
        System.out.println(mixString(s1,s2));
    }

    public static String mixString(String s1, String s2)
    {
        String s12 ="";
        for(int i=0; i<s1.length(); i++)
        {
            s12+=s1.substring(i,i+1)+s2.substring(i,i+1);
        }
        return s12;
    }
}
*/

//R-3

/*class Practice2
{
    public static void main(String[] args) {
        String str1 = "abczef";
        String str2 = "adatplqzh";
        String str3 = "dbeuptvwmy";
        System.out.println(alphabetical(str1));
        System.out.println(alphabetical(str2));
        System.out.println(alphabetical(str3));

    }

    public static String alphabetical(String str)
    {
        String str2 = str.substring(0,1); //put the first character of the string str in the string str2
        for(int i=1; i<str.length(); i++)
        {
            char ch1 =str2.charAt(str2.length()-1);//convert the last substring of str2 into char, means it will always compare the last character
            if(ch1<str.charAt(i)){
                //str2+=String.valueOf(str.charAt(i)); this is also working
                str2+=str.substring(i,i+1);
            }
        }
        return str2;
    }
}*/

//R-4

/*class Practice2{
    public static void main(String[] args) {
        SomeObject so = createObject();
        System.out.println(so.property1);
        System.out.println(so.property2);
        System.out.println(so.property3);
    }
        public static SomeObject createObject()
        {
            return new SomeObject(50,true,"hi");
        }

    }


class SomeObject{

    public int property1;
    public boolean property3;
    public String property2;

    public SomeObject(int x, boolean y, String z)
    {
        this.property1 = x;
        this.property3 = y;
        this.property2 = z;
    }
}*/

//Dictionary /Maps in Java

/*class Practice2{
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();// list in maps are resizable
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington","Olympia");
        System.out.println(map);

        map.put("Alaska","Juneau");
        System.out.println(map);

        String capital = map.get("Oregon");
        System.out.println("The capitol is " + capital);
        map.remove("California");
        System.out.println(map);
    }
}
*/
//Hash Maps
/*use key-value pairs and a hashing function to store and organise their data. A hashing function maps a key or object to
a specific hash.
The hash determines where the object is stored.
AS long as you have the key, retrieving the object is fast.
A hash maps is a data structure with key-value paairs where hashing function is used to locate the elements.
For "Z" ----->26------>"Zebra"
but ,,---------------->"Zoo"  as z key will map to both and here hashing will lead to collision. Solve it by having list data
structure associated with that key.
 */

/*class Practice2{
    public static void main(String[] args) {
        HashMap<String, Integer> wordToNum = new HashMap();
        //Insert key- and - value pairs into the Hashmap
        wordToNum.put("ONE",1);
        wordToNum.put("TWO",2);
        wordToNum.put("THREE",3);
        wordToNum.put("FOUR",4);
        wordToNum.put("FIVE",5);
        System.out.println(wordToNum.get("THREE"));
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());
        System.out.println(wordToNum.remove("FOUR"));
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());
    }
        }*/

//Common use of Hash maps which character is the most repeated

/*class Practice2{
    public static void main(String[] args) {
        String s = "phonebook";
        HashMap<Character, Integer> hashMap = new HashMap();
        for(int i=0; i<s.length(); i++)
        {
            Character currentChar = s.charAt(i);
            if(hashMap.containsKey(currentChar))
            {
                //increment current value for this key in hash map by 1
                hashMap.put(currentChar,hashMap.get(currentChar)+1);
            }
            else
            {
                hashMap.put(currentChar,1);
            }
        }
        Character mostRepeated=' ';
        int max=0;
        for(Character key:hashMap.keySet())
        {
            int currentValue = hashMap.get(key);
            if(currentValue>max)
            {
                mostRepeated=key;
            } max = currentValue;
            System.out.println("MostRepeated : "+mostRepeated + "Times : "+max );
        }


    }
}*/



//R-5 Pluralizer

/*class Practice2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Integer ints = in.nextInt();

        System.out.print(ints + " ");
        //System.out.println((ints));

        System.out.println(Pluralizer(s, ints));

        // System.out.print(Pluralizer(s,ints));

    }

    public static String Pluralizer(String s, Integer ints) {
        //HashMap<String,Integer> maps = new HashMap<>();
        if (ints == 1) {
            return s;
        } else if (ints >= 0) {
            if (s.substring(s.length() - 2).equals("fe")) {
                return replaceLast(s,"fe", "ves");
            } else if (s.substring(s.length() - 2).equals("sh")) {
                return s+="es";
            } else if (s.substring(s.length() - 2).equals("ch")) {
                return s+="es";
            } else if (s.substring(s.length() - 2).equals("us")) {
                return replaceLast(s,"us", "i");
            } else if (s.substring(s.length() - 2).equals("ay")) {
                return s+="s";
            } else if (s.substring(s.length() - 2).equals("oy")) {
                return s+="s";
            } else if (s.substring(s.length() - 2).equals("ey")) {
                return s+="s";
            } else if (s.substring(s.length() - 2).equals("uy")) {
                return s+="s";
            } else if (s.substring(s.length() - 1).equals("y")) {
                return replaceLast(s,"y", "ies");
            }



        }return s+="s";
    }
    public static String replaceLast(String s, String from, String to){
        int lastIndex = s.lastIndexOf(from); // index of the string from that is last
        //if(lastIndex<0) return s;//check condition that it should be less than 0 which it is
        String tail = s.substring(lastIndex).replaceFirst(from,to);
        return s.substring(0,lastIndex)+tail;
    }

    }
*/

// this one is different
/*class Practice2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Integer ints = in.nextInt();

        System.out.print(ints + " ");
        //System.out.println((ints));

        System.out.println(Pluralizer(s, ints));

        // System.out.print(Pluralizer(s,ints));

    }

    public static String Pluralizer(String s, Integer ints) {
        //HashMap<String,Integer> maps = new HashMap<>();
        if (ints == 1) {
            return s;
        } else if (ints >= 0) {
            if (s.substring(s.length() - 2).equals("fe")) {
                return (s.substring(0,s.length()-2)) + (s.substring(s.length()-2)).replaceFirst("fe","ves");
            } else if (s.substring(s.length() - 2).equals("sh")) {
                return s+="es";
            } else if (s.substring(s.length() - 2).equals("ch")) {
                return s+="es";
            } else if (s.substring(s.length() - 2).equals("us")) {
                return s.substring(0,s.length()-2)+s.substring(s.length()-2).replaceFirst("us","es");
            } else if (s.substring(s.length() - 2).equals("ay")) {
                return s+="s";
            } else if (s.substring(s.length() - 2).equals("oy")) {
                return s+="s";
            } else if (s.substring(s.length() - 2).equals("ey")) {
                return s+="s";
            } else if (s.substring(s.length() - 2).equals("uy")) {
                return s+="s";
            } else if (s.substring(s.length() - 1).equals("y")) {
                return s.substring(0,s.length()-2) + s.substring(s.length()-2).replaceFirst("y","ies");
            }


        }return s+="s";
    }

    }*/

//Poker Face

/*class practice2{
    public static class MyCard{
        public final int CLUBS = 0, DIAMOND = 1, HEARTS = 2, SPADES = 3;

        private int value; // between 1 and 13
        private int suit; // between 0 and 3 (i.e., one of the constants above)

        public MyCard(int value, int suit)
        {
            this.value = value;//the contructor stores the information in a field
            this.suit = suit;
        }

        public int getSuit()
        {
            return suit;
        }

        public int getValue()
        {
            return value;
        }

        public String toString()//return card in string format
        {
            ArrayList<String> suit = new ArrayList<String>();//store value in the suit
            suit.add("Clubs");
            suit.add("Diamonds");
            suit.add("Hearts");
            suit.add("Spades");

            ArrayList<String> value = new ArrayList<String>();//store value in the value
            for(int i=0; i<=14; i++)
            {
                value.add(i,String.format("%d",i));
            }
            value.remove(1);
            value.add(1,"Ace");
            value.remove(11);
            value.add(11,"Jack");
            value.remove(12);
            value.add(12,"Queen");
            value.remove(13);
            value.add(13,"King");
            value.remove(14);
            value.add(14,"Ace");
            return value.get(this.getValue()) + " of " + suit.get(this.getSuit());

        }
    }

    public static class MyHand{
        public ArrayList<MyCard> cards;

        public MyHand(){
            cards = new ArrayList<MyCard>();
        }

        public String toString() // return hand in string format
        {
            String s = "";
            for(int i=0; i<4; i++)
            {
                s+=cards.get(i) + ", ";
            }
            s+= cards.get(4);
            return s;
        }

        public void sort(){
            MyCard temp;
            for(int i=4; i>0; i--)
            {
                for(int j=0; j<i; j++)
                {
                    if(cards.get(j).getValue()>cards.get(j+1).getValue()){
                        temp = cards.get(j);
                        cards.set(j,cards.get(j+1));
                        cards.set(j+1,temp);
                    }
                }
            }
        }

        public Boolean isStraight(){
            //System.out.println(" *** TEST 1 ***" + cards.toString());
            this.sort();
            //System.out.println(" *** TEST 2 ***" + cards.toString());
            Boolean r = true;
            int v = cards.get(0).getValue();
            for(int i=1; i<5; i++){
                if(cards.get(i).getValue()!= v+i) r = false;
            }
            if(r==true)return r;
            else if(cards.get(0).getValue()==1)
                cards.set(0,new MyCard(14, cards.get(0).getSuit()));
            this.sort();
            r = true;
            v = cards.get(0).getValue();
            for(int i=1; i<5; i++){
                if(cards.get(i).getValue()!=v+i) r = false;
            }
            return r;
        }

        public Boolean isFlush(){
            Boolean r = true;
            int s = cards.get(0).getSuit();
            for(int i=1; i<5; i++)
            {
                if(cards.get(i).getSuit()!=s) r = false;
            }
            return r;
        }
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();// obtain the number of hands

        MyHand h = new MyHand();

        while(n>0)
        {
            h.cards.clear();
            for(int i=0; i<5; i++)
            {
                int val, suit;
                MyCard c;

                val = in.nextInt();
                suit = in.nextInt();
                c = new MyCard(val,suit);
                h.cards.add(c);
            }
            System.out.println(h.toString());
            if(h.isStraight() && h.isFlush())
                System.out.print("Straight Flush");
            else if(h.isStraight())
                System.out.println("Straight");
            else if(h.isFlush())
                System.out.println("Flush");
            else
                System.out.println("None");
            n--;
        }
    }
}*/



























