import java.io.IOException;

//Создайте метод doSomething(), который может быть источником одного из
//типов checked exceptions (тело самого метода прописывать не обязательно).
//Вызовите этот метод из main и обработайте в нем исключение, котороевызвал метод doSomething().
public class Task1 {
    public static void main(String[] args){
        try {
            doSomething();
        }catch (IOException e) {}
    }
    public static void doSomething() throws IOException {
//        try{
//            throw new IOException();
//        } catch (IOException e){}

//        if (2 % 2 == 0) throw new IOException(); // можно так обмануть, т.к. подряд 2 необработанных исключения бросить нельзя
//        throw new ClassNotFoundException();
        throw new IOException();
    }
}
