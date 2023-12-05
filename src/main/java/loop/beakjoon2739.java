package loop;
import java.util.Scanner;
public class beakjoon2739 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // 반복문 for 사용 (초기화; 조건식; 증감식)
        int i = 0;
        int n = scanner.nextInt();
        for(i=1; i<=9; i++){
            System.out.println(n+" "+"*"+" "+i+" "+"= "+(n*i));
        }
    }
}
