package filesystem;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        File directory = new File(args[0]);

        File[] files = directory.listFiles();

        Arrays.sort(files);

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}