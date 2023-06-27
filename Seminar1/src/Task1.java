import java.lang.reflect.Array;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[4];
        try {
            System.out.println("До генерации исключения");
            array[7] = 10;
            System.out.println("Эта строка не будет отображаться");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за границы массива");
//            ex.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
}


