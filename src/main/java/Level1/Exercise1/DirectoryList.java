package Level1.Exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryList {

    public static void listDirectory(File directory) {

        File[] files = directory.listFiles();

        if (files == null) {
            return;
        }

        Arrays.sort(files);

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}