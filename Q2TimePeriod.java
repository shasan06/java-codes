public class Q2TimePeriod {
    private int hours;
    private int minutes;

    public Q2TimePeriod(int h, int m){
        this.hours=h+m/60;
        this.minutes=m%60;
    }
    public void scale(int factor){
        this.hours=this.hours*factor+this.minutes*factor/60;
        this.minutes=this.minutes*factor%60;

    }


    public String toString(){
        return "" + hours + "h " + minutes + "m";
    }
}

