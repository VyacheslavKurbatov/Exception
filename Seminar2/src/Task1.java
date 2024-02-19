public class Task1 {
    public static void main(String[] args) {
        try {
            myInput(-1);
        } catch (MyException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        } finally {
            System.out.println("Выполнение блока finally");
        }

    }
    public static void myInput(int value) throws MyException{
        if(value < 0){
            throw new MyException("Значение не может быть отрицательным");
        }
        System.out.println("Обработка значения текста " + value);
    }
}

class MyException extends Exception{
    public MyException(String mes){
        super(mes);
    }
}