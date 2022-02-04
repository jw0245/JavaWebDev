package Test;

public class Mydate {

    private int day;
    private  int month;
    private  int year;


    public Mydate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;


    }
    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean is_Valid(){
        if (this.day > 31 || this.day < 0 || this.month > 12 || this.month < 0){
            //유효하지 않음
            return true;
        }
        else{
            //유효함
            return false;
        }

    }


}
