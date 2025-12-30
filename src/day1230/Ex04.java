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
    }
}
