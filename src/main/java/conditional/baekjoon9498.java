package conditional;
import java.util.Scanner;
public class baekjoon9498 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        if (90<=X){
            System.out.println("A");
        }else if (80<=X){
            System.out.println("B");
        }else if (70<=X){
            System.out.println("C");
        }else if (60<=X){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
