import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if (a.length != b.length){
            int[] c = new int[]{0};
            return c;
        } else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0){
                    throw new RuntimeException("/ by zero at " + i + " array element");
                } else {
                    c[i] = a[i] / b[i];
                }
//                try {
//                    c[i] = a[i] / b[i];
//                } catch (RuntimeException e) {
//                    System.out.printf("/ by zero at %d array element \n", i);
//                    break;
//                }
            }
            return c;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class HWTask3 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 0, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
