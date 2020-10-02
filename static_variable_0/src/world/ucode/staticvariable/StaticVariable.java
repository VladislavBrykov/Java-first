package world.ucode.staticvariable;

public class StaticVariable {
    public static int num = 1;
    public static int num_1 = 3;

    public static void main(String[] args) {
        int a = num - num_1;
        System.out.println(a);
    }
}
