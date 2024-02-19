import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Result: Your input was - 0
//Empty string has been input.

public class Task1 {
    public static void main(String[] args) {
        String patch = "C:\\Users\\Kurba\\Desktop\\Учеба GB\\Исключения в программировании и их обработка\\Семинар\\SemExep\\Sem2New\\names.txt";
        List<String[]> list = readFile(patch);
        modificationArray(list);
        writeFile(list, patch);
    }

    public static List<String[]> readFile(String patch) {
        List<String[]> listNames = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(patch));
            String line = "";
            while ((line = reader.readLine()) != null){
                listNames.add(line.split("="));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    return listNames;
    }

    public static void modificationArray(List<String[]> list){
        for (String[] item : list){
            if(item.length != 2){
                throw new IllegalArgumentException("Колличество оргументов не равно 2");
            }
            if(!item[1].equals("?") && !checkNumber(item[1])){
                throw new IllegalArgumentException("Элем не ? и не число");
            }
            item[1] = String.valueOf(item[0].length());
        }
    }

    public static boolean checkNumber(String value){
        try{
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static void writeFile(List<String[]> listName, String patch){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(patch));
            for (String[] item : listName){
                writer.write(item[0] + "=" + item[1] + "\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
