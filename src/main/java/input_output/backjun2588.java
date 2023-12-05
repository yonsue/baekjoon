package input_output;

import java.util.Scanner;
public class backjun2588 {
    public static void main(String[]args){

        // inputStreamReader -> System.in 으로 입력받아 문자열 출력
        Scanner scanner = new Scanner(System.in);

        /*

        String A = "abc";
        // 문자열 "123"의 charAt(0)은 숫자1이 아닌 문자"1"
        // DataType을 int형이 아닌 char로 변수를 지정해준다면 문자"1"을 갖고온다
        // int result 이므로 문자"1"의 ASCII 값(10진수)을 갖고온다.
        int result = A.charAt(0); // 0번째 인덱스 값인 1의 아스키 값
        System.out.println(result); // 49출력

         */
        int A = scanner.nextInt(); // 숫자입력
        String B = scanner.next(); // 곱해지는 값

        // System.out.println(A*(B.charAt(2))); 100*001 = 4900 charAt(2) <- '1'이 아스키 값으로 49이므로 *49가 된다
        // System.out.println(A*(B.charAt(2)-'0')); // 123*123 = 369 <- B.charAt(2) = 아스키 값으로 '51' '0'= '48' 이므로 '3'이 나온다
        System.out.println(A*(B.charAt(2)-'0')); // 3번째 자리 : 369
        System.out.println(A*(B.charAt(1)-'0')); // 2번째 자리 : 246
        System.out.println(A*(B.charAt(0)-'0')); // 1번째 자리 : 123
        System.out.println(A*Integer.parseInt(B)); // B가 문자형(String) 이므로 형변화 필요
        // ====> 결과 값: 15129
    }
}
