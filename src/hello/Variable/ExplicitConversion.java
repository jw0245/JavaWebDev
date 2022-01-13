package First.Hello.Variable;

public class ExplicitConversion
{
    public static void main(String[] args) {

        int i = 1000;
        byte bNum = (byte) i; // 명시적 형변환 - 데이터가 유실 될 수 있음

        System.out.println(bNum);

        double dNum1 = 1.2;
        float fNum =  0.9F;

        int iNum1 = (int) dNum1 + (int) fNum; //각 (double, float) 형을 int로 typecasting한 값
        int iNum2 = (int) (dNum1 + fNum); // dNum + fNum의 결과는 double이고 int로 변환

        //데이터가 유실될 수 있다.
        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
