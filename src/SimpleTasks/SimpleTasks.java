package SimpleTasks;

import java.util.Random;

public class SimpleTasks {
    public static void main(String[] args) {
        int intVar = 586;
        int intVar1 = ((intVar / 100) + (intVar / 10 % 10) + (intVar % 10));
        System.out.println(intVar1);                  // задача 1

        int intVar2 = 64;
        if (intVar2 % 2 == 0) {
            System.out.println("Число чётное"); // задача 2
        } else {
            System.out.println("Число нечётное");
        }

        int n = 34, m = 39;                  // задача 3
        int res = n > m ? m : n;
        System.out.println(res);

        int num = (int) (Math.random() * 117) +5;                    TODO: // не совсем понимаю как создать интервал [5; 122]
        if (num >= 100 || num <= 25) {
            System.out.println("Число "+num+" не содержится в интервале (25, 100)");
        } else {
            System.out.println("Число "+num+" содержится в интервале (25, 100)"); // задача 4
        }

        Random rand = new Random();             //задача 5
        int rand1 = rand.nextInt(899) + 100;
        int first = rand1 / 100;
        int second = rand1 / 10 % 10;
        int third = rand1 % 10;
        if (first >= second && first > third) {
            System.out.println("В числе "+rand1+" наибольшая цифра "+first+"");
        } else if (second > first && second > third) {
            System.out.println("В числе "+rand1+" наибольшая цифра "+second+" ");
        } else {
            System.out.println("В числе "+rand1+" наибольшая цифра "+third+" ");
        }


        for (int i = 1000; i <= 9999; i = i+3){         // задача 6
            System.out.println(i);
        }
        System.out.println("");

        for (int snils = 1, j=0; j<55 ; snils += 2, ++j){             // задача 7
            System.out.println(snils);
        }
        System.out.println("");


        for(int snils1 =90; snils1>=0; snils1 -=5){                   //задача 8
            System.out.println(snils1);
        }
        System.out.println("");

        for (int snils2 =2, j1=0; j1<20; snils2 *= 2, ++j1){      // задача 9
            System.out.println(snils2);
        }
        System.out.println("");


        int numFak;
        long Fak=1;




    }
}
