package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for (int i = 0 ; i < numbers.length ; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우: 증가하는 index 값이 필요할 때
    }
}
