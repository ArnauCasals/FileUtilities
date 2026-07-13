package filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Arrays;


public class DirectoryLister {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        File directory = new File(args[0]);

        try (PrintWriter writer = new PrintWriter(new FileWriter("directory-tree.txt"))) {

            listDirectory(directory, "", writer);

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    private static void listDirectory(File directory, String indentation, PrintWriter writer) {

        File[] files = directory.listFiles();

        Arrays.sort(files);

        for (File file : files) {

            String type = file.isDirectory() ? "D" : "F";

            Date lastModified = new Date(file.lastModified());

            writer.println(
                    indentation + type + " " + file.getName() + " " + lastModified
            );

            if (file.isDirectory()) {
                listDirectory(file, indentation + "    ", writer);
            }
        }
    }
}