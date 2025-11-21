import java.io.FileWriter;

public class File3 {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("abc.txt",true);
            obj.write("hey welcome to Java Programming");
            obj.write("Lets Learn File Handeling");
            obj.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
