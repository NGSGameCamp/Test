import java.util.Scanner;

public class Modular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력하세요. : ");
        int a = sc.nextInt();

        System.out.print("두 번째 수를 입력하세요. : ");
        int b = sc.nextInt();

        int result = a % b;
        System.out.print(a + "를 " + b + "로 나눈 나머지는 " + result + "입니다.");
    }
}
