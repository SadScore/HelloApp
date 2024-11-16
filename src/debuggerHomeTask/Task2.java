package debuggerHomeTask;

import static java.util.stream.Collectors.joining;

public class Task2 {
    /**
     * Дана строка "Привет, Александр, с праздником, с Новым Годом".
     * Написать программу, которая поменяет регистр символов.
     * Т.е. результат должен быть таким: пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ.
     */
    public static void main(String[] args) {
        String stroka1 = "Привет, Александр, с праздником, с Новым Годом";
        String upperlowerCase = stroka1
                .chars()
                .map(s -> Character.isUpperCase(s) ? Character.toLowerCase(s) : Character.toUpperCase(s))
                .mapToObj(s -> (char) s)
                .map(Object::toString)
                .collect(joining());
        System.out.println(upperlowerCase);
        System.out.println("----------------\nИЛИ");
        String s1 = "Привет, Александр, с праздником, с Новым Годом";
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        char c1;
        char c2;
        char c3;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            c3 = s3.charAt(i);
            if (c2==c1){
                System.out.print(c3);
                continue;
            }
            System.out.print(c2);
        }

    }


}





