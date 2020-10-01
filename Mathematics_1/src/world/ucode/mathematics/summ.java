package world.ucode.mathematics;

public class summ {
    public static void main(String[] args) {

        //automatic type conversion
        byte a = 1;
        byte b = 2;
        int c = (a + b);
        System.out.println(c);

        //explicit type conversion
        int d = 1;
        int k = 2;
        byte f = (byte) (a + b);
        System.out.println(f);
    }
}
