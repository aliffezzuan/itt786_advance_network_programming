
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
 
public class CreateNewFile
{
    public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();
    }
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("c:\\Users\\Aliff Ezzuan\\Assignment1\\source.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File source created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("abc def ghi \r\n" + "123 456\r\n");
          writer.close();
    }
}