package Level1.Exercise3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryList {

    public static void listDirectory(File directory, String indentation, StringBuilder result) {

        File[] files = directory.listFiles();

        if (files == null) {
            return;
        }

        Arrays.sort(files);

        for (File file : files) {

            String type = file.isDirectory() ? "D" : "F";

            result.append(indentation)
                    .append(type)
                    .append(" ")
                    .append(file.getName())
                    .append(" - ")
                    .append(getLastModified(file))
                    .append("\n");

            if (file.isDirectory()) {
                listDirectory(file, indentation + "    ", result);
            }
        }
    }
    private static String getLastModified(File file) {

        Date date = new Date(file.lastModified());

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        return format.format(date);
    }
}