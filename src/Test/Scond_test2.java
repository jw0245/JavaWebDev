package Test;

public class Scond_test2 {
    public static void main(String[] args) {
        /*정보은닉 - 날짜의 유효성을 검증하는 프로그램을 구현해 보세요
            다음과 같은 MyData 클래스가 있습니다.
            -day, month, year변수는 private으로 선언합니다.
            -각 변수의 getter,setter를 public으로 구현합니다.
            -MyDate(int day, int month, int year) 생성자를 만듭니다.
            -public boolean is Valid() 메서드를 만들어 날짜가 유효한지 확인합니다.
            -MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인합니다.
        *
        */

        Mydate date = new Mydate(10,10,2000);

        if(date.is_Valid()){

            System.out.println("유효하지 않은 날짜입니다.");
        }
        else {
            System.out.println("유효한 날짜입니다.");
        }

    }

}
