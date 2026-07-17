package Level1.Exercise4;

import java.io.File;

public class FileValidator {

    public static boolean isValidFile(File file) {

        if (!file.exists()) {
            System.out.println("File not found.");
            return false;
        }

        if (!file.isFile()) {
            System.out.println("The path is not a file.");
            return false;
        }

        if (!file.getName().endsWith(".txt")) {
            System.out.println("The file is not a TXT file.");
            return false;
        }

        return true;
    }
}