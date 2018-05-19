import java.io.IOException;
import java.nio.file.*;

public class Replacement {
    public static void main(String[] args) throws IOException {

        // Get paths for input and target files.
        FileSystem system = FileSystems.getDefault();
        Path original = system.getPath("c:\\Users\\Aliff Ezzuan\\Assignment1\\source.txt");
        Path target = system.getPath("c:\\Users\\Aliff Ezzuan\\Assignment1\\output.bin");

        // Copy original to target location.
        Files.copy(original, target, StandardCopyOption.REPLACE_EXISTING);
        //Files.deleteIfExists(Paths.get("c:\\Users\\Aliff Ezzuan\\Assignment1\\source.txt"));
        System.out.println("Done!");
    }
}