import java.io.IOException;

//Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
//такого типа можно было работать в блоке try with resources. Нужно бросить
//исключение, если работа с объектом типа счетчик была не в ресурсном try
//и/ или ресурс остался открыт Подумайте какой тип исключения по дойд е т лучше всего.
public class Task2Counter implements AutoCloseable{
    private Integer counter = 0;

    public Integer add() throws IOException{
        checkClose();
        return ++counter;
    }

    public void checkClose() throws IOException{
        if(counter == null){
            throw new IOException();
        }
    }
    @Override
    public void close() {
        System.out.println("Method close");
        counter = null;
    }
}
