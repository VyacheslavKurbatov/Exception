//Задание №2
//        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения: метод может работать только с
//        квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
//        только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
//        ошибке.
public class Task3 {
    public static void main(String[] args) {
        int[][] array = {   {1, 0, 1},
                            {1, 0, 1},
                            {1, 0, 1}   };

        System.out.println(summary(array));
    }

    public static int summary(int[][] lst) {
        int summary = 0;
        if (lst.length != lst[0].length){
            throw new RuntimeException("Массив не квадратный");
        }
        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < lst[i].length; j++) {
                summary += lst[i][j];
                if (lst[i][j] != 0 && lst[i][j] != 1){
                    throw new RuntimeException("В массиве присутствуют элементы отличные от 0 и 1");
                }
            }
        }
        return summary;
    }
}
