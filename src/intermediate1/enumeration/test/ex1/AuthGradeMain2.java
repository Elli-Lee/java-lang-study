package intermediate1.enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String input = sc.nextLine();
        AuthGrade grade = AuthGrade.valueOf(input);

        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");

        printMenuList(grade);
    }

    private static void printMenuList(AuthGrade grade) {
        if (grade.name().equals("GUEST")) {
            System.out.println("- 메인 화면");
        } else if (grade.name().equals("LOGIN")) {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (grade.name().equals("ADMIN")) {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    }
}
