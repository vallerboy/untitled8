import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Oskar\\Desktop\\akademia\\test.txt");


        try {
            Files.write(file.toPath(), "\r\nasdasd".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> strings = null;
        try {
            strings =   Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(strings);
    }

    public static String loadUserData(String nick) {
            if(nick == null || nick.isEmpty()){
                throw new IllegalArgumentException("Nick can not be empty or null");
            }

          return "jaka tam data dla usera " + nick;
    }
}
