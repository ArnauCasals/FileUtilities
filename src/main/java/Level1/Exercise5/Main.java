package Level1.Exercise5;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Arnau", 33);

        Serializer.serialize(person, "person.ser");

        Person recoveredPerson = Serializer.deserialize("person.ser");

        System.out.println(recoveredPerson);
    }
}