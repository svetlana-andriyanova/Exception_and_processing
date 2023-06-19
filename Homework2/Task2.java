/*  Если необходимо, исправьте данный код
   try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

*/
package Homework2;

public class Task2 {
   public static void main(String[] args) {
      try {
         int d = 1;
         int[] intArray = {1, 2, 3, 4, 5, 7, 8, 9, 10};
         double catchedRes1 = intArray[12] / d;
         System.out.println("catchedRes1 = " + catchedRes1);
      } catch (ArithmeticException e) {
         System.out.println("Деление на ноль.");
      } catch (IndexOutOfBoundsException ex) {
         System.out.println("Выход за пределы массива.");
      }
   }
}