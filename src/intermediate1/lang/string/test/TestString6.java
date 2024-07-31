package intermediate1.lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }

        /* 내 풀이
        int index = 0;
        int count = 0;
        while(index < str.length()){
           int firstIndex = str.indexOf(key, index + 1);
           if (firstIndex > 0) {
               count++;
               index += firstIndex;
           }
        }
        */
        System.out.println("count = " + count);
    }
}
