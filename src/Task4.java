import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        File file;
        Scanner scanner = new Scanner(System.in);


        String answer;
        do{
            printMenu();

            answer = scanner.nextLine();
            switch (answer) {
                case "1": {
                    String fileText = scanner.nextLine();
                    file = new File(fileText);

                    file.mkdirs();
                    break;
                }
                case "2": {
                    String fileText = scanner.nextLine();
                    file = new File(fileText);

                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }while (!answer.equals("exit"));
    }

    private static void printMenu() {
        System.out.println("1 - Dodaj katalog");
        System.out.println("2 - Dodaj plik");
    }
}
