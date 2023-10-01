package lab_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {

    public static void main(String[] args){
        String path1 = "D:/institute/java/lab_2/lab_2/src/lab_4/text1.txt";
        String path2 = "D:/institute/java/lab_2/lab_2/src/lab_4/text2.txt";

        Path out = Paths.get(path1);
        Path in = Paths.get(path2);

        try {
            byte[] fileContent = Files.readAllBytes(out);
            Files.write(in,fileContent);

            System.out.println("Файл успешно скопирован");
        }
        catch (IOException e){
            System.err.println("Произошла ошибка " + e);
        }


    }
}
