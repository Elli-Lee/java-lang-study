package start.array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] numArr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");

        for(int i = 0 ; i < numArr.length ; i++) {
            numArr[i] = keyboard.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numArr.length ; i++) {
            System.out.print(numArr[i]);
            if (i != numArr.length - 1) {
                System.out.print(", ");
            }

        }
    }
}
