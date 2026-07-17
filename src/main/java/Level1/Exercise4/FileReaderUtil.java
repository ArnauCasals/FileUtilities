package Level1.Exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderUtil {

    public static void readFile(String filePath) {

        try {

            List<String> lines = Files.readAllLines(Path.of(filePath));

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        }
    }
}