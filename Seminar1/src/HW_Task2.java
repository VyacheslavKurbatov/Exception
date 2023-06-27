import java.util.InputMismatchException;
import java.util.Scanner;

public class HW_Task2 {
//    Простая задача 2: Обработка некорректного ввода
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");

        try {
            int age = iScanner.nextInt();
            System.out.println(age);
        } catch (NumberFormatException | InputMismatchException ex){
            System.out.println("Некорректный ввод");
        }
    }
}
