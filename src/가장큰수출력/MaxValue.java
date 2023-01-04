package 가장큰수출력;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리의 정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int a, b, c;
        a = number / 100;
        b = (number % 100) / 10;
        c = number % 10;

    }
}
