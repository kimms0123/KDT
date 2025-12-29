package day1229;

public class Ex02 {
    public static void main(String[] args) {

        // 변수 선언(초기화 x) -> 오류 발생
        boolean b; // 불리안
        char ch; // 문자
        int i; // 정수
        double d; // 실수

        // 초기화 (o)
        b = true;
        ch = 'A'; // char 타입은 문자 한 개 저장 -> 홑따움표로 묶어야 함
        i = 10;
        d = 3.14;

        // 출력
        System.out.println(b);
        System.out.println(ch);
        System.out.println(i);
        System.out.println(d);

        // 선언 + 초기화
        int abc = 100;
        int def = 200;

        abc = 1;
        abc = 2 + 10 * 5;
        System.out.println(abc);
        System.out.println(def);

        int x = 20, y = 10;
    }
}
