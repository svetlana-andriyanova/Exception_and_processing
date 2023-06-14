/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. */

package Homework1;

public class Task3 {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 10, 5, 4, 8 };
        int[] array2 = { 2, 1, 5, 0, 12 };
        diffArray(array1, array2);

    }

    public static void diffArray(int[] array1, int[] array2) throws Exception {
        if (array1.length != array2.length) {
            throw new Exception("Array's lengths don't match");
        } else {
            int[] newArr = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                newArr[i] = array1[i] - array2[i];
                System.out.print(newArr[i] + " ");
            }
        }
    }
}