package Level1.Exercise3;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {

    public static void writeFile(String content, String fileName) {

        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write(content);

        } catch (IOException exception) {
            System.out.println("Error writing file: " + exception.getMessage());
        }
    }
}