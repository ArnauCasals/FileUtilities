package filesystem;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person("Arnau", 33);

        serializeObject(person);

        Person recoveredPerson = deserializeObject();

        System.out.println(recoveredPerson);
    }


    public static void serializeObject(Person person) throws IOException {

        ObjectOutputStream output =
                new ObjectOutputStream(new FileOutputStream("person.ser"));

        output.writeObject(person);

        output.close();
    }


    public static Person deserializeObject() throws IOException, ClassNotFoundException {

        ObjectInputStream input =
                new ObjectInputStream(new FileInputStream("person.ser"));

        Person person = (Person) input.readObject();

        input.close();

        return person;
    }
}