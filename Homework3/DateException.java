package Homework3;

public class DateException extends Exception{
    public DateException() {
    }

    public void dataException(String i) {
        System.out.printf("Некорректный формат даты: %s", i);
        System.out.println();
    }
}