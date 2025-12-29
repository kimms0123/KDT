package day1229;

public class Ex03 {
    public static void main(String[] args) {
        // overflow
        byte bb = (byte)128; // (타입): 강제 형변환

        System.out.println(bb);

        /*
            정수의 진법
            10진수(0~9): 3
            8진수(0~7) : 0으로 시작하는 수
            16진수(0~F): 0x로 시작하는 수
            2진수(0,1) : 0b로 시작하는 수
        */
        int i = 15;
        int j = 015;
        int k = 0x15;
        int l = 0b0101;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

        // 문자열
        String str = "hello"; // 문자열 저장
        System.out.println(str);
        str = "a"; // 한글자 저장 가능, 빈 문자 저장 가능
    }
}
