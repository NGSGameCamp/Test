import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("계산식 -> 1번째 숫자 - 2번째 숫자");

        System.out.print("1번째 숫자: ");
        num1 = sc.nextInt();

        System.out.print("2번째 숫자: ");
        num2 = sc.nextInt();

        System.out.println("결과 : " + (num1 - num2));
    }
}
