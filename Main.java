import java.util.Objects;

class Date {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //constructor
    public Date() {
        setDay(1);
        setMonth(1);
        setYear(2000);
    }

    public void advance() {
        if (day < 31) {
            setDay(day + 1);
        } else {
            if (month < 12) {
                setDay(1);
                setMonth(month + 1);
            } else {
                setYear(year + 1);
                setMonth(1);
                setDay(1);
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }
    // test the equals method
    public static void main(String[]args){
        Date d = new Date();
        d.advance();
        System.out.println(d);
        Date d2 = new Date();
        System.out.println(d.equals(d2));
        d2.advance();
        System.out.println(d.equals(d2));
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
