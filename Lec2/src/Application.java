import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Application {
    public static void main(String[] args) {
//        Object object = new String("123");
//        File file = (File) object;

//        String number = "123fq";
//        int result = Integer.parseInt(number);
//        System.out.println(result);

//        List<Objects> emptyList = Collections.emptyList();
//        emptyList.add(new Object());

//        int number = 1;
//        try {
//            number = 10 / 1;
//            String test = null;
////            System.out.println(test.length());
//            Collections.emptyList().add(new Object());
//        } catch (ArithmeticException e){
//            System.out.println("operation divide by zero not supported");
//        } catch (NullPointerException e){
//            System.out.println("Null Pointer Exception");
//        } catch (Exception e){
//        System.out.println("Exception");
//        }
//        System.out.println(number);
        FileReader test = null;
        try {
            test = new FileReader("C:\\Users\\Kurba\\Desktop\\Учеба GB\\Исключения в программировании и их обработка\\Семинар\\SemExep\\Lec2\\src\\test");
//            test.read();
        } catch (RuntimeException | IOException e){
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finished");
        }
    }
}
