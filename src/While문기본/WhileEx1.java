package While문기본;

public class WhileEx1 {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++; // 변수값을 1 증가
            System.out.println("나무를 " + treeHit + "찍었습니다");
            if(treeHit == 10) {
                System.out.println("나무가 넘어 갑니다.");
            }

        }
    }
}
