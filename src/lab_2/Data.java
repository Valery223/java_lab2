package lab_2;

public class Data{
    private int year;
    private int month;
    private int day;

    public Data(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Data(){
        this(0,0,0);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return year  + "." + month + "." + day;

    }
}
