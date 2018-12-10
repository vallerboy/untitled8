import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Oskar\\Desktop\\akademia\\test.txt");
        Scanner scanner = new Scanner(System.in);


        String answer;
        do{
            answer = scanner.nextLine();
            try {
                Files.write(file.toPath(), (answer + "\r\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (!answer.equals("exit"));
    }
}
