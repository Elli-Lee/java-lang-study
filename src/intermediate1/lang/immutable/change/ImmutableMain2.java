package intermediate1.lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        // 계산 이후에도 기존값과 신규 값 모두 활용 가능
        System.out.println("obj1 = " + obj1.getValue());
//        System.out.println("obj2 = " + obj2.getValue());
    }
}
