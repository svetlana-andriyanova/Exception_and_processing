/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */

package Homework1;

public class Task1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        
    }
// Выход за пределены массива
    public static void method1(){
        int array[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        }
    }
//Деление на 0
    public static void method2(){
        int num1 = 2;
        int num2 = 0;
        try {
            num1 = num1/num2;
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero impossible");
        }
    }
//Обращение к пустой строке
    public static void method3(){
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
     
            System.out.println("Trying to get the length of a null string");
        }
    }
}
