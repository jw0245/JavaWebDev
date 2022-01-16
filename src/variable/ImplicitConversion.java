package variable;

public class ImplicitConversion {

    public static void main(String[] args) {

        // 묵시적 형 변환 : 작은 수에 큰수로 덜 정밀한 수에서 더 정밀한 수로 대입되는경우
        // 명시적 형 변환 : 변환되는 자료 형을 명시하며 자료의 손실이 발생할 수 있다.
        // 이를 방지하기 위하여 반드시 Typecasting을 해줘야 함.

        byte bNum = 10;
        int iNum = bNum; // 묵시적 형변환 -문제없음

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;

        System.out.println(dNum);
    }
}
