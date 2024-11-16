package FileHomeTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class LetterWriter {
    /**
     * Необходимо написать программу, которая дописывает файл. Программа предлагает записать данные фразой "Вводите данные для записи".
     * После того, как введены данные в консоль (необходимо использовать класс Scanner для ввода данных в консоль),
     * программа предлагает дополнить информацию фразой «Введите что-нибудь еще» и данные можно дописать.
     * Вся работа по заполнению файла ведется в бесконечном цикле.
     * Если пользователь введет 0, программа завершается строкой «Файл создан».
     */
    public static void main(String[] args) throws IOException {
        File file = new File("D://MyFile/Letter");
        FileWriter writer = new FileWriter(file, true);
        System.out.println("Введите данные для записи: ");
        String lineZero = " ";
        Scanner scanner = new Scanner(System.in);
        do {

            String line = scanner.nextLine();
            writer.write('\n' + line);
            lineZero = line;
            if (!lineZero.equals("0")) { // Добавил проверку чтобы после введения "Нуля" не писалась строка "Введите что-нибудь еще"
                System.out.println("Ведите что-нибудь еще: ");
            }

        } while (!lineZero.equals("0"));

        writer.close();
        System.out.println("Файл создан!");

    }
}
