package basic.final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value = 10;


    // 이미 final 변수를 생성과 동시에 초기화 한 경우 생성자를 통해 초기화 할 수 없다.
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
