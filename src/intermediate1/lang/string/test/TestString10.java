package intermediate1.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] splitted = fruits.split(",");

        for (String str : splitted) {
            System.out.println(str);
        }

        String joinedString = String.join("->", splitted);
        System.out.println("joinedString = " + joinedString);
    }
}
