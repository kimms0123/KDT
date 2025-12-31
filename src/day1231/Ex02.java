package day1231;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 연산자 문제
        // 문제 1. 정수 두 개를 입력받고, 몫과 나머지 출력
        System.out.println("정수2개 입력 >> ");
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("몫: " + num1 / num2);
        System.out.println("나머지: " + num1 % num2);

        // 문제 2. 날(day)를 입력받고, 몇개월 몇일인지 출력 단 한달은 30일로 고정
        System.out.println("날(day) 입력 >> ");
        int totalDay = Integer.parseInt(sc.nextLine());

        int month = totalDay / 30;
        int day = totalDay % 30;
        System.out.println(month + "개월" + day + "일");

        // 문제 3. 점수 3개를 입력받고, 총점과 평균을 구하여 출력
        System.out.println("점수 3개 입력 >> ");
        int score1 = Integer.parseInt(sc.nextLine());
        int score2 = Integer.parseInt(sc.nextLine());
        int score3 = Integer.parseInt(sc.nextLine());

        int total = score1 + score2 + score3;
        int ave = total / 3;
        System.out.println("총점: " + total);
        System.out.println("평균: " + ave);


        // if 문 문제
        // 문제 4. 숫자 하나를 입력받고, "음수"인지 "양수"인지 판단해 출력
        System.out.print("숫자 입력(음수 허용) >> ");
        int num3 = Integer.parseInt(sc.nextLine());
        if(num3 >= 0) {
            System.out.println("양수");
        } else {
            System.out.println("음수");
        }

        // 문제 5. 1~99사이 숫자를 입력받고, "짝수"인지 "홀수"인지 판단해 출력
        System.out.print("1~99 사이 숫자 입력 >> ");
        int num4 = Integer.parseInt(sc.nextLine());
        if (num4 > 0 && num4 < 100) {
            if (num4 % 2 == 0) {
                System.out.println("짝수입니다");
            } else {
                System.out.println("홀수입니다");
            }
        } else {
            System.out.println("Error: 잘못된 숫자 입력.");
        }

        // 문제 6. 정수 3개를 입력받고, 가장 큰 수를 출력 ( 단 각 수는 서로 다름)
        System.out.println("정수 3개 입력 >> ");
        int num5 = Integer.parseInt(sc.nextLine());
        int num6 = Integer.parseInt(sc.nextLine());
        int num7 = Integer.parseInt(sc.nextLine());

        if (num5 >= num6 && num5 >= num7) {
            System.out.println("가장 큰 수: " + num5);
        } else if (num6 >= num5 && num6 >= num7){
            System.out.println("가장 큰 수: " + num6);
        } else {
            System.out.println("가장 큰 수: " + num7);
        }

        // 문제 7. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리 두 점으로 표현한다
        //(100, 100)과 (200, 200)의 두 점으로 이루어지는 사각형이 있을 때, x, y 값을 각각 입력받고, 점(x, y)가 이 직사각형 안에 있는지 판단하는 프로그램 작성하시오
        // 단 사각형에 닿아있는 점도 안에 있다고 판단한다.

        System.out.println("x, y 값 각각 입력 >> ");
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());

        if(x >= 100 && x <= 200){
            if (y >= 100 && y <= 200){
                System.out.println("점 x, y는 직사각형 안에 있다.");
            }
        } else {
            System.out.println("x, y는 직사각형 안에 없다.");
        }
    }
}
