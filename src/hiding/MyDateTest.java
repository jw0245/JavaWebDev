package hiding;


public class MyDateTest {

    public static void main(String[] args) {

        MyDate date = new MyDate();
        date.setMonth(10);
        date.setYear(2019);
        date.setDay(100);
        date.showData();

        MyDate date2 = new MyDate();
        date2.setMonth(10);
        date2.setYear(2019);
        date2.setDay(100);
        date2.showData();
    }
}