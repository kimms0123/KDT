package day1230;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
            입력문: 개발 시 콘솔을 통해 값을 입력받을 수 있는 기능
            1. import문 생성
                import java.util.Scanner; (자동생성)
            2. Scanner 객체 생성
                Scanner 변수명 = new Scanner(System.in);
            3. 입력받기
                String 저장변수명 = 변수명.nextLine(); << 입력한 한줄 전부 문자열로 가져옴
            4. Scanner 객체 닫기
                변수명.close();
        */
        // 객체 생성
        Scanner sc = new Scanner(System.in);
        // 입력 받기
        System.out.print("숫자를 입력하세요 >> ");
        int num = sc.nextInt();
        // 객체 닫기
        sc.close();
        System.out.println(num);
    }
}
