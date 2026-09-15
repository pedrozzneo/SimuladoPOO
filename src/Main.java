import models.Post;
import models.UserAccount;

public class Main {
    static void main() {

        UserAccount pedrozzneo = new UserAccount("pedrozzneo@gmail.com", "pedrozzneo");
        UserAccount lucas = new UserAccount("lucas@gmail.com", "lucas");

        pedrozzneo.acceptFollower(lucas);
        lucas.acceptFollower(pedrozzneo);

        pedrozzneo.publish("1");
        pedrozzneo.publish("2");
        pedrozzneo.publish("3");
        pedrozzneo.publish("4");
        pedrozzneo.publish("5");
        pedrozzneo.publish("6");
        pedrozzneo.publish("7");
        pedrozzneo.publish("8");
        pedrozzneo.publish("9");
        pedrozzneo.publish("10");
        pedrozzneo.publish("11");
        pedrozzneo.publish("12");
        pedrozzneo.publish("13");
        pedrozzneo.publish("14");
        pedrozzneo.publish("15");
    }
}
