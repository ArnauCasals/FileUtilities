package Level1.Exercise4;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("example.txt");

        if (FileValidator.isValidFile(file)) {
            FileReaderUtil.readFile(file.getPath());
        }
    }
}