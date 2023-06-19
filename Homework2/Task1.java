/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

package Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while(!inputFloat());
    }
    
    public static boolean inputFloat(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            float f = sc.nextFloat();
            System.out.println(f);
            sc.close();
            return true;
        }catch(Exception e){
            System.out.println("Некорректный ввод! Повторите. ");
            return false;
        }
    }
}