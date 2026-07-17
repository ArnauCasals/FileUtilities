package Level1.Exercise5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {

    public static void serialize(Person person, String fileName) {

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {

            output.writeObject(person);

        } catch (IOException exception) {
            System.out.println("Error serializing object: " + exception.getMessage());
        }
    }

    public static Person deserialize(String fileName) {

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {

            return (Person) input.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.out.println("Error deserializing object: " + exception.getMessage());
            return null;
        }
    }
}