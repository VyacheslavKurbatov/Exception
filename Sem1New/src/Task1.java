import java.util.List;

//Задание №0
//        Реализуйте метод, принимающий в качестве аргумента
//        целочисленный массив.
//        Если длина массива меньше некоторого заданного минимума,
//        метод возвращает -1, в качестве кода ошибки, иначе - длину
//        массива.
public class Task1 {
    public static void main(String[] args) {

    }

    public static Integer checkLens(List<Integer> lst, int minSize) {
        if(lst.size() < minSize){
            return -1;
        }
        return lst.size();
    }
}
