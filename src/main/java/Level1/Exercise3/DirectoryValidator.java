package Level1.Exercise3;

import java.io.File;

public class DirectoryValidator {

    public static boolean isValidDirectory(File directory) {

        if (!directory.exists()) {
            System.out.println("Directory not found.");
            return false;
        }

        if (!directory.isDirectory()) {
            System.out.println("The path is not a directory.");
            return false;
        }

        return true;
    }
}