package Level1.Exercise3;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File directory = new File("TestDirectory");

        if (DirectoryValidator.isValidDirectory(directory)) {

            StringBuilder result = new StringBuilder();

            DirectoryList.listDirectory(directory, "", result);

            FileWriterUtil.writeFile(result.toString(), "directoryTree.txt");
        }
    }
}