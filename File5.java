import java.io.File;

public class File5 {
    public static void main(String[] args) {
        File obj = new File("abc.txt");
        if (obj.delete()){
            System.out.println("File Deleted Successfully");
        }
        else{
            System.out.println("FIle doesn't exist");
        }
    }
}
