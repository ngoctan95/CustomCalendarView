package nguyenngoctan44.io.uranashel_multirangecalendarview;

public class UNCalendar {
    private int year;
    private int month;
    private int date;

    public UNCalendar(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public UNCalendar() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
