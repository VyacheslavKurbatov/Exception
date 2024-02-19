
//class Answer {
//    public static void arrayOutOfBoundsException() {
//        int[] arr = new int[10];
//        int elem = arr[100];
//
//    }
//
//    public static void divisionByZero() {
//        int a = 0;
//        int b = 10 / a;
//
//    }
//
//    public static void numberFormatException() {
//        String string = "number";
//        int whatNumber = Integer.parseInt(string);
//
//    }
//}
//public class HWTask1 {
//    public static void main(String[] args) {
//        Answer ans = new Answer();
//        try {
//            ans.arrayOutOfBoundsException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива");
//        }
//
//        try {
//            ans.divisionByZero();
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль");
//        }
//
//        try {
//            ans.numberFormatException();
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка преобразования строки в число");
//        }
//    }
//}
