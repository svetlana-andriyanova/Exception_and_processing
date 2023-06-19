/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        inputString();
    }
    
    public static void inputString() throws Exception{
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        if(str.isEmpty()){
            throw new Exception("Пустую строку вводить нельзя!");
        }
        System.out.println("Все верно!");        
    }
}
