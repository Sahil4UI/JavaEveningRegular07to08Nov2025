import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File4 {
    public static void main(String[] args) {
        try {
            File obj = new File("abc.txt");
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
