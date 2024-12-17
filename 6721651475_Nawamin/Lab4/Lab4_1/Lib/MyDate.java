package Lib;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int d) {
        day = d;
    }
    public void setMonth(int m) {
        if (m > 12) {
            System.out.println("cant set.");
        } else {
            month = m;
        }
    }
    public void setYear(int y) {
        year = y;
    }
    public void setDate(int d, int m, int y) {
        setDay(d);
        setMonth(m);
        setYear(y);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
