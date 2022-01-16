package Test;

import java.util.Scanner;

public class First_test {

    /* 1. 연산자와 두수를 변수로 선언한 후 사칙연산이 수행되는 프로그램 구현
        if-else if=else, switch 두방식 모두 구현

       2. *로 다이아 몬드 만들기
                *
               ***
              *****
             *******
              *****
               ***
                *
     */

    public static void main(String[] args) {

        // 1번 문제
        int n = 100;
        int m = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("연산을 입력해 주세요 : ");
        String con = scanner.next();

        if(con.equals("+")){
            System.out.println(n+m);
        }
        else if(con.equals("-")){
            System.out.println(n-m);
        }
        else  if(con.equals("x")){
            System.out.println(n*m);
        }
        else if(con.equals("/")){
            System.out.println(n/m);
        }
        else{
            System.out.println("잘못 입력하여 종료합니다.");
        }

    }

}
