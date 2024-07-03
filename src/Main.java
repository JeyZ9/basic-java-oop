import model.Address;
import model.Person;

public class Main {
    public static void main(String[] args) {
        Address add = new Address("213", "nakhon phathom", "np", "7300");
        Person person = new Person("jack", 15, add);

        System.out.println(person);

    }
}