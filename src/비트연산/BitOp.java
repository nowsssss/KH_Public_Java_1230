package 비트연산;
// 비트연산자 : 0/1로 구성된 비트 단위의 연산을 수행
// & (비트 AND) : 연산을 수행하는 두개의 비트가 모두 1인 경우 1이 됨
// | (비트 OR) : 연산을 수행하는 두개의 비트 중 1개만 1이면 1이 됨
// ^ (XOR) : 두개의 비트가 같으면 0, 다르면 1
// ~ (비트를 반전) : 0이면 1, 1이면 0으로 만듬
// << (Shift 연산자) : 지정된 수만큼 비트를 왼쪽으로 이동
// >> (Shift 연산자) : 지정된 수만큼 비트를 오른쪽으로 이동
public class BitOp {
    public static void main(String[] args) {
        int num1 = 10; // 0000 1010
        int num2 = 12; // 0000 1100

        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(num1 << 1);
        System.out.println(num1 >> 1);
    }
}
