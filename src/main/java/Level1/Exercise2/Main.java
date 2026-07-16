package Level1.Exercise2;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File directory = new File("TestDirectory");

        if (DirectoryValidator.isValidDirectory(directory)) {
            DirectoryList.listDirectory(directory, "");
        }
    }
}