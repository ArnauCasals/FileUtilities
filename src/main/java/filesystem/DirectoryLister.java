package filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Please provide a TXT file.");
            return;
        }

        File file = new File(args[0]);

        readTxtFile(file);
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


    public static void readTxtFile(File file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}