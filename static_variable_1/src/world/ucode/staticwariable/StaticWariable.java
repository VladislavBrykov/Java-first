package world.ucode.staticwariable;

public class StaticWariable {

    //the variable is public to any child class
    public static int number;

    public static String DEPARTMENT = "Рассчет:";

    public static void main(String[] args) {
        number = 4000;
        System.out.println(DEPARTMENT+" Средняя зарплата: "+number+"$");
    }
}
