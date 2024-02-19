import java.util.List;

//Задание №1
//        Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
//        значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
//        например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
//        качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//        4. придумайте свои варианты исключительных ситуаций и верните соответствующие
//        коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
//        метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
//        значение и покажет читаемый результат пользователю. Например, если вернулся -2,
//        пользователю выведется сообщение: “Искомый элемент не найден”.
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        checkError(checker(array, 3, 7));
        checkError(checker(array, 7, 4));
        checkError(checker(null, 3, 4));
        checkError(checker(array, 3, 4));
    }
    public static Integer checker(int[] lst, int minSize, int elem) {
        if(lst == null){
            return -3;
        }
        if(lst.length < minSize){
            return -1;
        }
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] == elem){
                return i;
            }
        }
        return -2;
    }

    public static void checkError(int error) {
        switch (error) {
            case -1:
                System.out.println("длина массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("искомый элемент не найден");
                break;
            case -3:
                System.out.println("вместо массива пришел null");
                break;
            default:
                System.out.println("Индекс найденного элемента" + error);
                break;
        }
    }
}
