package world.ucode.wordstring;

public class Work_String {
    public static void main(String[] args) {
        String str_1 = "Hello";
        String str_2 = "World";
        System.out.println(str_1 + " " + str_2);

        String num = 2 + 2 + "";    //"4"
        String num_1 = "" + 2 + 2;  //"22"

        String foo = "a string";
        String bar = "a string";    //bar будет указывать на тот же объект что и foo
        String baz = new String("a string");    // Чтобы гарантированно создать новую строку надо вызвать конструктор

        System.out.println("foo == bar ? " + (foo = bar));  //сравнение ссылок
        System.out.println("foo равен bar? " +(foo.equals(bar)));   // Метод equals служит для проверки двух объектов на равенство
        System.out.println("foo равен bar ? " + (foo.equals(bar))); // Метод equals служит для проверки двух объектов на равенство
        System.out.println("foo == baz ? " + (foo == baz));
        System.out.println("foo равен baz ? " + (foo.equals(baz)));
    }
}
