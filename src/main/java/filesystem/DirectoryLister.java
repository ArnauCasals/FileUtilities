package filesystem;

import java.io.File;
import java.util.Date;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        File directory = new File(args[0]);

        listDirectory(directory, "");
    }

    private static void listDirectory(File directory, String indentation) {

        File[] files = directory.listFiles();

        Arrays.sort(files);

        for (File file : files) {

            String type = file.isDirectory() ? "D" : "F";

            Date lastModified = new Date(file.lastModified());

            System.out.println(
                    indentation + type + " " + file.getName() + " " + lastModified
            );

            if (file.isDirectory()) {
                listDirectory(file, indentation + "    ");
            }
        }
    }
}