import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new EmailMessenger();

        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("John Boe", 25);
            people[2] = new Person("John Roe", 40);
            people[3] = new Person("John Toe", 35);
            people[4] = new Person("John Woe", 20);

            for (int i = 0; i < people.length; i++) {
                int age = people[i].getAge();
                int result = MathUtils.add(age, b);
                String message = "Suma " + age + " i " + b + " wynosi " + result;
                messenger.sendMessage(message);
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
