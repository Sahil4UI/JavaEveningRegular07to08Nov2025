import java.io.File;
import java.io.IOException;

class File1{
    public static void main(String[] args) throws IOException {
        File obj = new File("abc.txt");
        if (!obj.exists()){
            obj.createNewFile();
            System.out.println("file created");
        }
        else{
            System.out.println("File already exists");
        }

    }
}