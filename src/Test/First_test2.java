package Test;

import java.util.Scanner;

public class First_test2 {
    public static void main(String[] args) {
        // 스위치문을 이용한 문제1
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int n = 100;
        int m = 20;
        int result = 0;
        switch (input){
            case "+" : result = n+m;
                System.out.println(result);
                break;
            case  "-" : result = n-m;
                System.out.println(result);
                break;
            case "x" : result = n*m;
                System.out.println(result);
                break;
            case "/" : result = n/m;
                System.out.print(result);
                break;
            default : result = 0;
        }
        System.out.println(input + "를입력 받아 " + "n" + input + "m 은 " +  result + " 입니다");

        }

}

