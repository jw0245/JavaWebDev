package Test;

public class First_test3 {

    public static void main(String[] args) {
        /*
        2. *로 다이아 몬드 만들기
                *
               ***
              *****
             *******
              *****
               ***
                *
         */

        for(int i=1; i<8; i = i+2){
            for(int n=3; n>i/2; n--){
                System.out.print(" ");
            }
            for(int m=0; m<i; m++) {

                System.out.print("*");
            }
            System.out.println("");
            }
        for(int j = 1; j<6; j = j+2){
            for(int k = 0; k<=j/2; k++){
                System.out.print(" ");
            }
            for(int o = 5; o>=j; o--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

