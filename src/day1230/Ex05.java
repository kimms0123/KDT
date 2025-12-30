package day1230;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        // 스캐너
        Scanner sc = new Scanner(System.in);

        // 문제1. 정수 2개를 입력받고, 사칙연산한 결과를 출력
        System.out.println("== 문제1. 정수 2개를 입력받고, 사칙연산한 결과를 출력 ==");
        System.out.print("정수1 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("정수2 입력 >> ");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println("=================================================");

        // 문제2-1. 초단위 정수를 입력받고, "?분?초" 형태로 연산된 결과 출력
        System.out.println("문제2-1.초단위 정수를 입력받고, \"?분?초\" 형태로 연산된 결과 출력");
        System.out.print("초 입력 >> ");
        int totalsec = sc.nextInt();
        int min = totalsec / 60;
        int sec = totalsec % 60;
        System.out.println(min + "분" + sec +"초");

        // 문제2-2. 초단위 정수를 입력받고, "?시간?분?초" 형태로 연산된 결과 출력
        System.out.println("=================================================");
        System.out.println("문제2-2.초단위 정수를 입력받고, \"?시간?분?초\" 형태로 연산된 결과 출력");
        System.out.print("초 입력 >> ");
        int totalsec2 = sc.nextInt();
        int time = totalsec2 / 3600;
        int min2 = (totalsec2 % 3600) / 60;
        int sec2 = totalsec2 % 60;
        System.out.println(time + "시간" + min2 + "분" + sec2 + "초");

        // 문제3. 최소 화폐매수 구하기
        //       금액을 입력하면, 최소한의 화폐 매수를 구하는 프로그램
        //       금액 입력 >> 67800
        //       5만원: 1장
        //       1만원: 1장 etc...
        /*
        System.out.println("=================================================");
        System.out.println("문제3.최소 화폐매수 구하기");
        System.out.print("금액 입력 >> ");
        int totalPrice = sc.nextInt();
        int fiveMan = totalPrice / 50000;
        int man = (totalPrice % 50000) / 10000;
        int fiveCheon = (totalPrice % 10000) / 5000;
        int cheon = (totalPrice % 5000) / 1000;
        int fiveWon = (totalPrice % 1000)/500;
        int won = (totalPrice % 500)/100;
        System.out.println("오만원: " + fiveMan );
        System.out.println("만원: " + man);
        System.out.println("오천원: " + fiveCheon);
        System.out.println("천원: " + cheon);
        System.out.println("오백원: " + fiveWon);
        System.out.println("백원: " + won);
        */

        System.out.println("=================================================");
        System.out.println("다른 방식으로 풀어본 3");
        System.out.print("금액 입력 >> ");
        int totalPrice = sc.nextInt();
        int remain = totalPrice;
        int fiveMan = totalPrice / 50000;
        remain %= 50000;
        int man = remain / 10000;
        remain %= 10000;
        int fiveCheon = remain / 5000;
        remain %= 5000;
        int cheon = remain / 1000;
        remain %= 1000;
        int fiveWon = remain/500;
        remain %= 500;
        int won = remain/100;
        System.out.println("오만원: " + fiveMan );
        System.out.println("만원: " + man);
        System.out.println("오천원: " + fiveCheon);
        System.out.println("천원: " + cheon);
        System.out.println("오백원: " + fiveWon);
        System.out.println("백원: " + won);

        sc.close();

    }
}
