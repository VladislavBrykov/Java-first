package world.ucode._wrapper;

public class Wrapper {
    public static void main(String[] args) {
        int i= 345;
        Integer I = i;
        String str = I.toString();
        System.out.println(str);

        String STR = "345";
        Integer f = Integer.parseInt(STR);
        System.out.print(f);

    }
}
