import java.io.FileNotFoundException;

//1.Создайте класс исключения, который будет выбрасываться при делении на 0.
//Исключение должно отображать понятное для пользователя сообщение об ошибке.
//2.Создайте класс исключений, которое будет возникать при обращении к
//пустому элемен ту в массиве с сылочного типа Исключение должно отображать понятное для пользователя сообщение об ошибке
//3.Создайте класс исключения, которое будет возникать при попытке открыть
//несуществующий файл. Исключение должно отображать понятное для пользователя сообщение об ошибке
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(div(5, 0));
        } catch (DivByZero e){
            System.out.println(e.getMessage());
        }
    }

    public static double div(int a, int b){
        if (b == 0) throw new DivByZero();
        return a / b;
    }
}

class DivByZero extends ArithmeticException {
    public DivByZero(){
        super("Деление на 0 запрещено");
    }
}

class ArrayExeption extends Exception{
    public ArrayExeption(int n) {super("Выход за пределы массива, при обращении по индексу " + n);}

    public ArrayExeption(){super("Выход за пределы массива");}
}

class NotFile extends FileNotFoundException {
    public NotFile(String path) {super("Открыть несуществующий файл нельзя. Ваш путь к файлу -> " + path);}

    public NotFile(){super("Открыть несуществующий файл нельзя.");}
}
