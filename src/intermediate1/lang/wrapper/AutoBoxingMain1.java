package intermediate1.lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedvalue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedvalue = " + unboxedvalue);
    }
}
