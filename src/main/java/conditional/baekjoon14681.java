package conditional;
import java.util.*;
//23.12.08
// A,B 좌표값이 ++:1 +=:2 --:3 -+:4 <== 입력값에 따라 맞는 번호 출력
// && 논리연산자 이용하여 풀이
public class baekjoon14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();

        if(A>0&&B>0){
          System.out.println(1);
        }else if (A<0&&B>0) {
            System.out.println(2);
        }else if (A<0&&B<0) {
            System.out.println(3);
        }else if (A>0&&B<0) {
            System.out.println(4);
        }

    }
}
