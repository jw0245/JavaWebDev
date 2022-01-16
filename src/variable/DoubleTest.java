package variable;

public class DoubleTest {
    public static void main(String[] args) {

        double dNum = 3.14;

        // flaot fNum = 3.14로 할 경우 3.14가 더 큰 수 이기 때문에 자료형은 double로
        // 저장되어야한다.
        // 자료형을 flaot로 주기 위해서는 해당 값은 실수지만 내부적으로 flaot로 저장하자는 명령을
        // 해야하므로 값의 맨 뒤에 식별자 F를 넣어주여한다.
        float fNum = 3.14F;
        System.out.println(dNum);
        System.out.println(fNum);

        // 부동 소수점의 오류 예시
        // 예상결과는 1001 이지만 0.000000000159의 오차가 발생함
        double dNum1 = 1;
        for (int i = 0; i<10000; i++){
            dNum1 = dNum1 + 0.1;
        }
        System.out.println(dNum1);

    }
}
