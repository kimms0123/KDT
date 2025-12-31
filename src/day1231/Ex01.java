package day1231;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
            조건문
                - if문
                    - 조건이 참이면 영역 안의 코드를 실행
                    - if문 영역안의 실행문이 1개일 시 중괄호 생략 가능
                  구조
                  - if(조건식)
                    {
                        조건이 참일 때 실행될 코드
                    }
                  > 조건식은 비교 연산이나 논리연산이 혼합된 식 또는 boolean 타입변수로 구성 => true/false 형태
                  - if- else
                    if(조건식) {
                        조건이 참일때 실행
                    } else {
                        조건이 거짓일 때 실행
                    }
                    > 조건이 거짓일 경우 반드시 실행되어야 할 코드가 있으면 else 구문에 작성 else 뒤에는 조건식 없음
                  - if - else if - else
                    if(조건식1) {
                        조건1이 참일 때 실행
                    } else if (조건식2) {
                        조건2가 참일 때 실행
                    } else {
                        모든 조건이 거짓일 때
                    }
                    > 조건이 여러개일 경우 else if 구문으로 조건 늘림
                    > 이때 조건식을 하나의 set로 생각해 이 조건들 중 만족하는 조건이 나오면 나머지 실행 안 함 (else는 옵션 개념)
                  - 이중 if 문
                    if(조건식1) {
                        if(조건식2) {
                            조건식 1이 참이고 조건식 2가 참일 때 실행
                        }
                    }
                - switch문

        */
        // if 문
        int a = 200;
        if (a > 10) {
            System.out.println("a는 10보다 크다.");
        }
        if (a - 10 > 10) {
            System.out.println("10보다 크다");
        }
        // 문제1. score 점수가 60점 이상이면 합격
        int score = 70;
        if (score >= 60){
            System.out.println("합격");
        }if (score < 60){
            System.out.println("불합격");
        }

        // if-else문
        if (score >= 60){
            System.out.println("합격");
        }else System.out.println("불합격");

        // 문제2. 100점 이하 점수를 입력받고, 90점 이상이면 수 80점 우 70점 미 그 이하 재시험
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 >> ");
        int score1 = sc.nextInt();
        //int score1 = Integer.parseInt(sc.nextInt());
        if (score1 >= 90){
            System.out.println("수");
        } else if (score1 >= 80) {
            System.out.println("우");
        } else if (score1 >= 70) {
            System.out.println("미");
        } else {
            System.out.println("재시험");
        }

        // 이중 if 문(비교 + 논리)
        if (score1 <= 100 && score1 >= 0){
            if (score1 >= 90){
                System.out.println("수");
            } else if (score1 >= 80) {
                System.out.println("우");
            } else if (score1 >= 70) {
                System.out.println("미");
            } else {
                System.out.println("재시험");
            }
        } else { // 예외 처리
            System.out.println("잘못된 점수 입력");
        }
        sc.close();
        /*
            반복문
        */
    }
}
