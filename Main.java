import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 3);
        System.out.println("Suma: " + result);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Suma wynosi: " + result);
    }
}
