package day1230;

public class Ex04 {
    public static void main(String[] args) {
        /*
        연산자
            - 단항연산자: + - (양수 음수) ++ -- ~ !
            - 이항연산자
                산술연산자: +, -, * / %
                비교연산자: < <= > >= == !=
                논리연산자: && || (&&가  ||보다 연산우선순위가 높음)
            - 삼항연산자: ? :
            - 대입연산자: =
            - 복합대입연산자 : 산술 + 대입: += -= *= /= %=
        */
        // 산술 연산자
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(10 / 4); // => int/int = 정수

        long l = 100000L * 100000;
        System.out.println("l = " + l);

        System.out.println("----------------------");
        // 증감연산자: 1씩 증가/감소 연산자
        // 전위형: 먼저 연산
        int num = 10;
        System.out.println("num = " + num);
        ++num; // num 값 + 1
        System.out.println("num = " + num);
        // 후위형: 가장 나중에 연산
        num--; // num 값 - 1
        System.out.println("num = " + num);

        int abc = 10;
        //System.out.println(++abc); // 11 >> 증가 후 출력
        System.out.println(abc++); // 10 >> 출력 후 증가

        // 비교 연산자: 연산 결과는 true or false
        System.out.println(10 > 5);
        boolean result = 50 <= 50;
        System.out.println("result = " + result);

        int a1 = 10;
        int b1 = 200;
        System.out.println(a != b);

        // 논리 연산자: boolean타입 또는 비교연산자를 이용한 비교식 여러개를 묶어줄 때 사용
        // &&(and): 양쪽 비교식 결과가 모두 참이어야 참 => 하나라도 거짓이면 거짓
        // ||(or): 양쪽 비교식 중 하나라도 참이면 참 => 둘다 거짓이어야 거짓
        // 우선순위: && > ||
        boolean res = (10 < 5 || 5 > 3) && 5 > 2;
        System.out.println("res = " + res);

        // 부정문 !: boolean 타입의 결과를 반전 시켜주는 연산자
        boolean hello = true;
        System.out.println(!hello);

        // 삼항 연산자: 비교식 또는 boolean값 ? 참일때 값 : 거짓을 때 값
        // 비교식 또는 boolean의 결과값이 true/false가 아닌 개발자가 원하는 어떤 값도 가능
        int result1 = 10 > 5 ? 10 : 5;
        System.out.println("result1 = " + result1);

        int a2 = 100;
        int b2 = 20;
        int res2 = a > b ? a : b;
        System.out.println("res2 = " + res2);

        char ch = a > b ? 'o' : 'x';
        System.out.println("ch = " + ch);

        String str = a > b ? null : "a가 크다";
        // String str = null; => 참조형 default 값은 null

        // 대입 연산자 =: 오른쪽의 모든 연산을 마친 결과를 왼쪽 변수에 저장
        int a3 = 10;
        System.out.println("a3 = " + a3);
        System.out.println(a);

        System.out.println(a = a + 10);
        System.out.println(a);

        // 복합대입연산자: 산술 + 대입
        // += -= *= /= %=
        int x = 100;
        System.out.println("x = " + x);
        // x = x + 20
        x += 20;
        System.out.println("x = " + x);
        // x * 20
        x *= 20;
        System.out.println("x = " + x);

        x += 1; // 복합대입
        x++; // 증감연산자

        x -= 1; // 복합대입
        x--; //감소연산자
    }
}
