import java.io.FileWriter;

public class File2 {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter(("abc.txt"));
            // obj.write("hey welcome to Java Programming");
            // obj.write("Lets Learn File Handeling");
            obj.write("hey vanshika");
            obj.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
