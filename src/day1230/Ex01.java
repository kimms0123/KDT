package day1230;

public class Ex01 {
    public static void main(String[] args) {

        int a = 10;
        long l = 20L; // 접미사
        // int b = 30L; => error 발생 큰->작(o) 작->큰(x) => 데이터 훼손의 위험
        double d = 1.23;
        // float f = 3.25; => error 발생 : 제공 데이터의 타입 불일치

        int aa = 0;
        System.out.println(aa);

        /*
            출력문
            - System.out.print();         엔터기능X
            - System.out.println();       엔터기능O
            - System.out.printf();        엔터기능X, 서식문자 사용
        */
        System.out.println(10 + 3);
        System.out.println("hello" + "world");

        System.out.println("a" + 10); // 숫자 + 문자열 = 문자열
        System.out.println("a" + 10 + 20); // 문자(string) + 숫자 + 숫자 = 문자열
        System.out.println('a' + 10); // 문자(char) + 숫자 = 아스키코드 + 숫자
        System.out.println("hello".length() + 10); // .length(): 문자열 길이 구함

        /*
        * 이스케이프 문자: 출력/문자열 안에서 문자열 관련 기능을 가지고 있는 특수 문자
        * \n: 줄내림
        * \t: tab 간격 추가
        * \": 쌍따옴표 문자 표현
        * \': 홑따옴표 문자 표현
        * \\: 역슬래쉬 문자 표현
        * */
        System.out.println("\"hello\n w\torld!");
        // System.out.println(\""); => "이스케이프 문자 사용" : 따옴표 안에서 사용 가능

        /*
         형변환(casting, type conversion, convert)
             - boolean 타입을 제외한 다른 타입들을 원하는 타입으로 변환
             - 기본형끼리, 참조형끼리 형변환 가능 >> 기본형과 참조형끼리 형변환 불가(** String과 기본형 직접 형변환 x)
             (타입) 변수
             - *강제 형변환*(다운캐스팅, 디모션): 큰타입 -> 작은 타입
                int n = 300;
                byte b = n; ==> error
                byte b = (byte) n; ==> 강제 형변환
             - *자동 형변환*(업캐스팅, 프로모션): 작은 타입 -> 큰 타입

             - 문자열 -> 기본형 형변환
                // String -> int
                int 변수 = Integer.parseInt("문자열")
                // String -> double
                double 변수 = Double.parseDouble("문자열)
                // String -> Long
                long 변수 = Long.parseLong("문자열")
             - 기본형 -> 문자열 형변환
                // int -> String
                int a = 100;
                String strA = a + "";
                // double
                double d = 3.14;
                String strD = d + "";
         */

        // 강제 형변환
        double d1 = 1.5;
        int i = (int)d1; // <= i = 1 (소수점 제외)

        // 자동 형변환
        double d2 = 3.14 * 10;

        // 기본 -> 문자 형변환
        int d3 = 3;
        String strD = d3 + "";
        System.out.println(strD);
    }
}
