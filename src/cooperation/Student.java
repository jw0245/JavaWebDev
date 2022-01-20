package cooperation;

public class Student {
    //객체간 협력

    String studentName;
    int grade;
    int money;

    public Student(String studentName,int money){
        this.studentName = studentName;
        this.money = money;

    }

    public  void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;

    }

    public void takeSubway(Subway subway){

        subway.take(1200);
        this.money -= 1200;
    }

    public  void showInfo(){
        System.out.println("남의 남은 돈은"+ money + "원 입니다.");

    }
}
