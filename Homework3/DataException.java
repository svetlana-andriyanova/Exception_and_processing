package Homework3;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.printf("Некорректно введены данные: %s", i);
        System.out.println();
    }
}