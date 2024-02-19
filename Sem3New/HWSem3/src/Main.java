import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваши Фамилию, Имя, Отчество, " +
                " дату рождения (dd.mm.yyyy), " +
                " номер телефона (целое беззнаковое число), " +
                " пол (f/m) разделенные пробелом: ");

        String data = in.nextLine();
        in.close();

        String[] arrayData = dataSeparation(data);

        try {
            checkError(amountData(arrayData));
            checkError(checkDateFormat(arrayData[3]));
//            checkError(checkPhoneNumberFormat(arrayData[4]));
//            checkError(checkGenderFormat(arrayData[5]));

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

//        DataWrite.createFile(arrayData);


    }

    public static String[] dataSeparation(String data){
        String[] arrayData = data.split(" ");
        return arrayData;
    }

    public static int amountData(String[] arrayData){
        int arrayLengh = arrayData.length;
        int numberException;
        if(arrayLengh == 6){
            numberException = 0;
        } else if (arrayLengh < 6) {
            numberException = 1;
        } else {
            numberException = 2;
        }
        return numberException;
    }

    public static int checkDateFormat(String date){
        int numberException;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date birthday = simpleDateFormat.parse(date);

            LocalDate localDate = LocalDate.now();
            int year = localDate.getYear();
            int month = localDate.getMonthValue();
            int dayOfMonth = localDate.getDayOfMonth();
            String day = dayOfMonth + "." + month + "." + year;
            Date locDay = simpleDateFormat.parse(day);

            if(birthday.after(locDay)){
                numberException = 6;
            } else numberException = 0;

        } catch (ParseException e) {
            numberException = 3;
        }
        return numberException;
    }

    public static int checkPhoneNumberFormat(String phoneNumber){
        int numberException;
        try {
            long check = Long.parseLong(phoneNumber);
        } catch (NumberFormatException e){
            return numberException = 4;
        }
        return numberException = 0;
    }

    public static int checkGenderFormat(String gender){
        int numberException;
        if (gender.length() == 1){
            gender = gender.toLowerCase();
            if (gender.equals("m") || gender.equals("f")) {
                numberException = 0;
            } else {
                numberException = 5;
            }
        } else {
            numberException = 5;
        }
        return numberException;
    }

    public static void checkError(int error){
        switch (error) {
            case 1 -> throw new LessDataEntered();
            case 2 -> throw new MoreDataEntered();
            case 3 -> throw new IncorrectDateException();
            case 4 -> throw new IncorrectPhoneNumberException();
            case 5 -> throw new IncorrectGenderException();
            case 6 -> throw new BirthdayAfterLocalDay();

        }
    }
}

class LessDataEntered extends RuntimeException {
    public LessDataEntered() {
        super("Данных меньше чем требуется");
    }
}
class MoreDataEntered extends RuntimeException {
    public MoreDataEntered() {
        super("Данных больше чем требуется");
    }
}

class IncorrectDateException extends RuntimeException{
    public IncorrectDateException() {
        super("Формат даты введен не верно. Формат даты dd.mm.yyyy");
    }
}

class IncorrectPhoneNumberException extends RuntimeException{
    public IncorrectPhoneNumberException() {
        super("Формат телефона пользователя введен не верно. Формат номера телефона 1234567890");
    }
}

class IncorrectGenderException extends RuntimeException{
    public IncorrectGenderException() {
        super("Вы неправильно указали пол! Если Вы мужчина укажите 'm', если Вы женщина укажите 'f'.");
    }
}

class BirthdayAfterLocalDay extends RuntimeException{
    public BirthdayAfterLocalDay() {
        super("День рождения не может быть позже текущей даты!");
    }
}

class DataWrite {
    public static void createFile(String[] array) throws IOException {
        String fileName = array[0] + ".txt";
        try {
            File path = new File(fileName);

            if (!path.exists()){
                path.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

            String writeString = String.join(" ", array);

            bw.write(writeString);
            bw.newLine();
            bw.close();


        } catch (IOException e){
            throw new IOException("Произошла ошибка во время создания или записи файла");
        }

    }
}
