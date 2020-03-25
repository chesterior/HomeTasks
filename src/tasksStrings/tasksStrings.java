package tasksStrings;

import java.util.Arrays;

public class tasksStrings {
    public static void main(String[] args) {
        // Задание 1
        // Даны 2 слова, состоящие из четного числа букв. Получить
        //  слово состоящее из первой половины первого слова и второй половины второго слова.

        String str1 = "САБЛЕЗУБЫЙ";
        String str2 = "ТИГР";
        System.out.println("Первое слово = " + str1);
        System.out.println("Второе слово = " + str2);
        String str3 = (str1.substring(0, str1.length()/2)) + (str2.substring(str2.length()/2));
        System.out.println(str3);



        // Задание 2.
        // Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.

        String str4 = "в травке сидел кузнечик";
        String str5 = "бык тупогуб тупогубенький бычок";
        String[] words1 = str4.split(" ");
        String[] words2 = str5.split(" ");
        System.out.println("Самое длинное слово: " + maxLengthWord(words1));
        System.out.println("Самое длинное слово: " + maxLengthWord(words2));
    }

    private static String maxLengthWord(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toLowerCase();
        }
        Arrays.sort(s);
        int len = 0;
        String longest = "";
        for (String string : s) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }
        return longest;

    }

    // Задание 3.
//    Имеются две строки. Найти количество вхождений одной строки в другую.
    public static void dog (String[] args) {

        System.out.println("CatDogCatDog".split("Cat", -1).length - 1);
    }
}
