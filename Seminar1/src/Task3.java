import java.lang.reflect.Array;

public class Task3 {

    static void genException () {
        int[] array = new int[4];
        System.out.println("До генерации исключения");
        array[7] = 15;
        System.out.println("Эта строка не будет отображаться");
    }
}

class UseMain{
    public static void main(String[] args) {
        try {
            Task3.genException();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Стандартное сообщение");
            System.out.println(ex);
            System.out.println("Стек вызовов");
            ex.printStackTrace();

        }
        System.out.println("после вывода catch");
    }
}
