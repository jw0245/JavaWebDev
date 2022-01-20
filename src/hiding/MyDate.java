package hiding;

import java.time.Year;

public class MyDate {

    public int day;
    public int month;
    public int year;
    private  boolean isValid;

    public void setDay(int day){
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12 )
        this.month = month;
    }

    public void showData(){

        if (isValid) {
            System.out.println(year + "년" + month + "월" + day + "일 입니다.");
        }
        else{
            System.out.println("유효하지 않는 날짜 입니다.");
        }

    }
}
