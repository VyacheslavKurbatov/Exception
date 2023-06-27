import java.util.Scanner;

public class HW_Task1 {
//    Простая задача 1: Проверка деления на ноль
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = iScanner.nextInt();

        System.out.print("Введите первое число: ");
        int number2 = iScanner.nextInt();

        iScanner.close();
        int result;
        try {
            result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException ex){
            System.out.println("Деление на ноль недопустимо");
        }
    }
}
