package start.array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("힉생수를 입력하세요: ");
        int studentNum = keyboard.nextInt();

        int[][] score = new int[studentNum][3];
        String[] subjects = {"국어", "영어", "수학"};
        for (int i = 0 ; i < score.length ; i++){
            System.out.println( (i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < score[i].length ; j++) {
                System.out.print(subjects[j] + " 점수: ");
                score[i][j] = keyboard.nextInt();
            }
        }

        for (int i = 0 ; i < score.length ; i++) {
            int sum = 0;
            double average = 0;
            for (int j = 0 ; j < score[i].length ; j++){
                sum += score[i][j];
            }
            average = (double)sum / score[i].length;
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
