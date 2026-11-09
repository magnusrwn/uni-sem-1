import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ReadWriteToFile {
    public static void main(String[] args)
    
    // checks for err
    throws FileNotFoundException {
        PrintWriter writer = 
        new PrintWriter("textFile.txt");
        writer.println("text in this file is now here");
        writer.close();
    }

}
