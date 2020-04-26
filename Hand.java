/*public class Hand{

    public Hand(String s)
    {
        s="1 1  2 1  3 1  4 1  51 ";//number and suit
    }

    public static void  toString()
    {

    }
}
*///Poker Face

/*import java.util.ArrayList;
import java.util.Scanner;

class Practice2{
    //which is a main class

    public static void main(String[] args) {
        Hand h = new Hand(" 6 3 2 1 3 1 4 1 5 1");
        System.out.println(h.toString());
        System.out.println(h.status());



    }
}

class Hand {

    ArrayList<Card> cards = new ArrayList<Card>(); // this is to hold the data it should be in the field

    Hand(String str) {

        Scanner in = new Scanner(str); // we are passing the input string from the main, so that we can split the value and the suit


        for (int i = 0; i < 5; i++) {
            int v = in.nextInt(); // first number of the string and then the second number is a suit
            int s = in.nextInt();
            cards.add(new Card(v, s));//creating five Cards;and putting it into the ArrayList of type card

        }


    }


    public String toString() {
        String s = "";
        for (int i = 0; i < 5; i++) {

            s += cards.get(i) + ",";
        }
        return s;
    }

    public void sort(){

        for(int i=4; i>=0; i--){//outer loop as there are 5 pairs
            for(int j=0; j<i; j++){//check with the four pairs
                Card temp;
                if(cards.get(j).getValue()>cards.get(j+1).getValue()){
                    temp = cards.get(j);
                    cards.set(j,cards.get(j+1));
                    cards.set(j+1,temp);
                }
            }

        }
    }

    public String status() {
        //boolean r = true;//set r = true if the card is a straight
        //boolean f = true; // means it is a flush
        this.sort();
        int v = cards.get(0).getValue(); //Access the data from the arrayList; put the first value in v
        int s = cards.get(0).getSuit();
        String m="";

        for (int i = 1; i < 5; i++) {
            if (cards.get(i).getValue() == v + 1 && cards.get(i).getSuit() == s) {
                m += "Straight flush";
                return m;
            } else if (cards.get(i).getValue() == v + 1 && cards.get(i).getSuit() != s) {
                m += "Straight";
                return m;
            } else {
                m += "Flush";
                return m;
            }
        }return "none";
    }
}
class Card{

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    private int value;
    private int suit;

    Card(int value, int suit){
        this.value=value;
        this.suit=suit;
    }

    @Override
    public String toString() {

        ArrayList<String> suit = new ArrayList<>();
        for(int i=0; i<=3; i++){
            suit.add(i,String.format("%d",i));
        }
        suit.remove(0);
        suit.add(0,"Clubs");
        suit.remove(1);
        suit.add(1,"Diamond");
        suit.remove(2);
        suit.add(2,"Hearts");
        suit.remove(3);
        suit.add(3,"Spades");

        ArrayList<String> values = new ArrayList<>();

        for(int i=0; i<=14; i++){

            values.add(i,String.format("%d",i));
        }

        values.remove(1);
        values.add(1,"Ace");
        values.remove(11);
        values.add(11,"Jack");
        values.remove(12);
        values.add(12,"Queen");
        values.remove(13);
        values.add(13,"Oueen");
        values.remove(14);
        values.add(14,"Ace");

        return values.get(this.getValue()) + " of " + suit.get(this.getSuit());


    }
}*/


/*import java.util.ArrayList;
import java.util.Scanner;

class Practice2 {
    public static void main(String[] args) {
        Hand h = new Hand("6 3 1 3 3 1 4 1 5 1");

        //System.out.println(h.toString());
        //System.out.println(h.status());

        h.sort();

        System.out.println(h.toString());
        System.out.println(h.status());

    }
}

class Hand {

    ArrayList<Card> cards = new ArrayList<Card>(); //store the values


    Hand(String str) {

        Scanner in = new Scanner(str);

        //creating five cards and separate their values in integer and value then put in cards
        for (int i = 0; i < 5; i++) {
            int v = in.nextInt();
            int s = in.nextInt();

            //Card mycards = new Card(v, s); //Generate 5 cards
            //cards.add(mycards);
            cards.add(new Card(v,s));

        }


    }


    public String toString(){
        String s="";

        for(int i=0; i<5; i++){

            s+= cards.get(i).toString() + " ";

        }

        return s;
    }

    public void sort(){

        Card temp;
        for(int i=4; i>0; i--){

            for(int j=0; j<i; j++){

                if(cards.get(j).getValue()>cards.get(j+1).getValue())
                {
                    temp=cards.get(j);
                    cards.set(j,cards.get(j+1));
                    cards.set(j+1,temp);
                }
            }
        }
    }

    public String status(){
        String s1="";


        int v = cards.get(0).getValue();
        int s = cards.get(0).getSuit();

        //check if its a straight
        for(int i=1; i<5; i++) {

            if(cards.get(i).getValue()==v+1 && cards.get(i).getSuit()==s)

                return s1+="Straight flush";

            else if (cards.get(i).getValue() == v + 1)

                return s1 += "Straight";
            //check for flush
            else if(cards.get(i).getSuit()==s)

                return s1+="Flush";

            //if not any
            else{
                return s1 ="none";
            }

        }


        return "";
    }





}

class Card{

    private int Value;
    private int Suit;


    Card(int value, int suit){
        this.Value = value;
        this.Suit = suit;
    }


    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public int getSuit() {
        return Suit;
    }

    public void setSuit(int suit) {
        Suit = suit;
    }

    @Override
    public String toString() {

        ArrayList<String> suit = new ArrayList<>();
        for(int i=0; i<=3; i++){
            suit.add(i,String.format("%d",i));
        }
        suit.remove(0);
        suit.add(0,"Clubs");
        suit.remove(1);
        suit.add(1,"Diamond");
        suit.remove(2);
        suit.add(2,"Hearts");
        suit.remove(3);
        suit.add(3,"Spades");

        ArrayList<String> values = new ArrayList<>();

        for(int i=0; i<=14; i++){

            values.add(i,String.format("%d",i));
        }

        values.remove(1);
        values.add(1,"Ace");
        values.remove(11);
        values.add(11,"Jack");
        values.remove(12);
        values.add(12,"Queen");
        values.remove(13);
        values.add(13,"Oueen");
        values.remove(14);
        values.add(14,"Ace");

        return values.get(this.getValue()) + " of " + suit.get(this.getSuit());
    }



}*/

import java.util.ArrayList;
import java.util.Scanner;

class Practice2{

    public static void main(String[] args) {

        Hand h = new Hand("1 1 2 1 3 1 4 1 5 1");
        System.out.println(h.toString());
        System.out.println(h.status());
    }
}

class Hand{

    ArrayList<Card> cards = new ArrayList<Card>();

    Hand(String str){

        Scanner in = new Scanner(str);

        for(int i=0; i<5; i++){

            int v = in.nextInt();
            int s = in.nextInt();
            cards.add(new Card(v,s));
        }
    }

    public String toString(){

        String s="";

        for(int i=0; i<5; i++){

            s+=cards.get(i).toString() + ", ";
        }
        return s;
    }

    public String status(){

        int v = cards.get(0).getValue();
        int s = cards.get(0).getSuit();
        String s1="";
        //checking the status

        for(int i=1; i<5; i++){

            if(cards.get(i).getValue()==v+1 && cards.get(i).getSuit()==s)
                return s1+="Straight flush";

            else if(cards.get(i).getValue()==v+1)
                return s1+="Straight";

            else if(cards.get(i).getSuit()==s)
                return s1+="Flush";

            else
                return s1+="none";
        }return "";
    }
}

class Card{
    private int Value;
    private int Suit;

    Card(int value, int suit)
    {

        this.Value=value;
        this.Suit=suit;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public int getSuit() {
        return Suit;
    }

    public void setSuit(int suit) {
        Suit = suit;
    }

    public String toString





}

