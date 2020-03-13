package Tasks1;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks1 {
        public static void main(String[] args) {          // задание 1 Найти наибольший общий делитель (НОД) двух чисел
        int a = 245, b = 756;
        while (b !=0) {
            int c = a%b;
            a = b;
            b = c;
        }
        System.out.println(a);

            System.out.println(1232424243);


            // Задание 2
            System.out.println("Задание 2");

            int[] testArr = {37,51,532,532,4,32,41,32,31,2,3,12,-11};        //   Дан массив целых чисел. Массив не отсортирован, числа могут
            Arrays.sort(testArr);                                            //  повторяться. Необходимо найти в данном массиве такие два числа n и m,
            for (int i = 0; i < testArr.length; i++) {                     //      чтобы их сумма была равна 7. Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7.
                int summ = 7;                                                  //    Постарайтесь решить задачу наиболее оптимальным способом
                int num1 = testArr[i];
                int num2 = summ - num1;
                int index = Arrays.binarySearch(testArr,num2);
                if (index >= 0 && index != i) {
                    System.out.println("сумма = " + num1 + "+" + num2);
                }
            }

            // Задание 3
            System.out.println("Задание 3");      // Заполните массив на N элементов случайным числами
            int n = 10;                          // и выведете максимальное, минимальное и среднее значение.
            int[] testArr2 = new int[n];
            for (int i = 0; i < testArr2.length; i++) {
                testArr2[i] = (int)  (Math.random() * n);
            }
            int max = 0;
            int min = 0;
            int avg = 0;
            int sum = 0;
            for (int i = 0; i <testArr2.length ; i++) {

                if (max < testArr2[i]) {
                    max = testArr2[i];
                }
                if (min > testArr2[i]){
                    min = testArr2[i];
                }
                sum += testArr2[i];
                avg = sum / testArr2.length;
            }
            System.out.println(Arrays.toString(testArr2));
            System.out.println("максимальное = " + max);
            System.out.println("минимальное = " + min);
            System.out.println("среднее = " + avg);



            //Задание 4
            System.out.println("Задание 4");          // Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
            Scanner in = new Scanner(System.in);     // Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
            System.out.println("введите целое число больше 3");   //Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
            int someNum = in.nextInt();  //Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
            if (someNum < 3){
                System.out.println("Введено не верное число, повторите ввод");
            }
            else {
                int[] testArr4 = new int[someNum];
                for (int i = 0; i < testArr4.length; i++) {
                    testArr4[i] = (int) (Math.random() * someNum);
                }
                System.out.println(Arrays.toString(testArr4));
                int[] resultArr = new int[testArr4.length];
                for (int i = 0; i < testArr4.length; i++) {
                    if (testArr4[i] % 2 == 0) {
                        resultArr[i] = testArr4[i];
                    }

                }
                System.out.println(Arrays.toString(resultArr));
            }
            //задание 5
            System.out.println("Задание 5");   //Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
            int[] [] newArr = new int[5][8];   // Вывести массив в консоль. После на отдельной строке вывести в консоль значение максимального элемента этого массива.
            int max1 = newArr[0][0];
            for (int i = 0; i < newArr.length; i++) {
                for (int j = 0; j < newArr[i].length; j++) {
                    newArr[i][j] = (int) ((Math.random()*199)-99);
                }
                for(int i1 = 0; i1 < newArr.length; i1++) {
                    for(int j1 = 0; j1 < newArr[i].length; j1++) {
                        if(newArr[i1][j1] > max1)
                            max1 = newArr[i1][j1];
                    }
                }
            }
            System.out.println(Arrays.deepToString(newArr));
            System.out.println("Максимальный элемент массива = " + max1);



    }
}