package loopexample;

public class BreakContinueTest {

    public static void main(String[] args) {

        int dan = 2;
        int count = 1;

        for( dan = 2; dan <=9; dan++) {
            if((dan%2) != 0) continue;
            for (count = 1; count <= 9; count++) {

                if(count>dan) break;
                System.out.println(dan + "x" + count + "=" + dan * count);

            }
            System.out.println();
        }
    }
}
