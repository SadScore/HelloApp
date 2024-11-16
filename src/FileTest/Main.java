package FileTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        File file = new File("D://MyFile");
//        File fileTwo = new File("D://", "MyFile");
//        File fileThree = new File(file, "MyFile");

//        String info = "Првиет как дела?";
//        String info2 = "Всё нормально!";
//        File file =  new File("D://MyFile/wrireandreadfile");
//        FileWriter writer = new FileWriter(file, true);
//        writer.write('\n'+info2);
//        writer.close();

        File file = new File("D://MyFile/wrireandreadfile");
        FileReader reader = new FileReader(file);
        char[] array = new char[200];
        reader.read(array);
        for (char c : array) {
            if (c == '\u0000') {
                break;
            }
            System.out.print(c);
        }
        reader.close();


    }
}
