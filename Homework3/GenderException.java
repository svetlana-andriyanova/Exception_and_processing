package Homework3;

public class GenderException extends Exception{
    public GenderException() {
    }

    public void sexException(String i) {
        System.out.printf("Некорректно введен пол: %s", i);
        System.out.println();
    }
}