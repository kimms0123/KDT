package day1230;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름 입력받고, 입력받은 이름 출력
        System.out.print("이름을 입력하시오 >> ");
        String name = sc.nextLine();
        System.out.println(name);

        // 나이 입력
        System.out.print("나이 입력 >> ");
        String age = sc.nextLine();
        System.out.println("age = " + age);
        // int intAge = (int)age; String과 기본형 직접 (타입) 형변환 불가
        int intAge = Integer.parseInt(age);
        System.out.println("내년 age = " + (intAge + 1));

        /*
        System.out.print("나이 입력 >> ");
        int age = sc.nextInt();
        System.out.println("age = " + age);
        System.out.println("내년 age = " + (int)(age + 1));
        */
        sc.close();
    }
}
