public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {4, 8, 16, 24, 128, 32, 256, 512};
        int[] array2 = {2, 0, 4, 4, 0, 8};
        try { //внешний блок try
            for (int i = 0; i < array1.length; i++) {
                try { //вутренний блок try
                    System.out.println(array1[i] + " / " + array2[i] + " = " + array1[i] / array2[i]);
                } catch (ArithmeticException ex) {
                    System.out.println("Попытка деления на 0");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("Не на что делить");
            System.out.println("Фатальня ошибка, выполнение прервано");
        }
    }
}

