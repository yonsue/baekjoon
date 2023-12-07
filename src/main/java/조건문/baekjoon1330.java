package 조건문;
import java.util.Scanner;
public class baekjoon1330 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("A의 값을 입력하시오.");
        int A = scanner.nextInt();
        System.out.println("B의 값을 입력하시오.");
        int B = scanner.nextInt();
/*
        // if -> else -> if -> else
        if(A>B){
            System.out.println("A>B");
        }else{
            if(A<B){
                System.out.println("A<B");
            }else{
                System.out.println("A==B");
            }
        }
 */
        // if -> else if -> else : 이쪽이 코드가 간결하고 가독성이 좋다
        if(A>B){
            System.out.println("A>B");
        } else if (A<B) {
            System.out.println("A<B");
        }else {
            System.out.println("A==B");
        }
    }

}
