import models.Post;
import models.UserAccount;

public class Main {
    static void main() {

        UserAccount pedrozzneo = new UserAccount("pedrozzneo@gmail.com", "pedrozzneo");
        pedrozzneo.publish("1");
        pedrozzneo.publish("2");
        pedrozzneo.publish("3");
        pedrozzneo.publish("4");
        pedrozzneo.delete(2);
    }
}
