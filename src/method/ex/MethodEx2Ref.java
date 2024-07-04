package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printHelloWorld(message, 3);
        printHelloWorld(message, 5);
        printHelloWorld(message, 7);
    }

    public static void printHelloWorld(String message, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}
