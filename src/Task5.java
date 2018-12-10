import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Oskar\\Desktop\\akademia\\test.txt");
        String wordToReplace = "kota";
        String replacement = "dom";

        List<String> lines = null;
        try {
             lines  = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder allText = new StringBuilder(); //+
        for (String line : lines) {
            allText.append(line.replace(wordToReplace, replacement)).append("\r\n");
        }

        try {
            Files.write(file.toPath(), allText.toString().getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
