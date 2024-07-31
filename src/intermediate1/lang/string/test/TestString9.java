package intermediate1.lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splitted = email.split("@");
        String id = splitted[0];
        String domain = splitted[1];
        System.out.println("Id = " + id);
        System.out.println("Domain = " + domain);
    }
}
