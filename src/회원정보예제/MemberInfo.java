package 회원정보예제;

import java.util.Scanner;

// 이름, 나이, 직업, 성별의 정보를 입력받기

public class MemberInfo {
    public static void main(String[] args) {
        // 회원정보를 위한 필드 추가
        String name;
        int age;
        char gender;
        int jobs;
        Scanner sc = new Scanner(System.in);

        public void setName() {
            System.out.print("이름을 입력 하세요 : ");
            name = sc. nextLine();
        }
        public void setAge() {
            while (age) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) return;
            System.out.println("나이를 잘못 입력 하였습니다.");
        }
        public void setGender() {
            while(true) {
            System.out.print("성별을 입력 하세요 : ");
            gender = sc.next().charAt(0);
            switch (gender) {
                case 'M' :
                case 'm' :
                case 'F' :
                case 'f' :
                    return; // 메소드를 호출한 곳으로 결과값을 전달하고 이동함
                default :
                    System.out.println("성별을 잘못 입력 하였습니다.");
            }
        }
    }
}
