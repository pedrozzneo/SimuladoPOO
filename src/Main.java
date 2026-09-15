import models.Post;
import models.UserAccount;

public class Main {
    static void main() {

        UserAccount pedrozzneo = new UserAccount("pedrozzneo@gmail.com", "pedrozzneo");
        UserAccount lucas = new UserAccount("lucas@gmail.com", "lucas");
        UserAccount caio = new UserAccount("caio@gmail.com", "caio");
        UserAccount matheus = new UserAccount("matheus@gmail.com", "matheus");

        pedrozzneo.acceptFollower(lucas);
        pedrozzneo.acceptFollower(caio);
        pedrozzneo.acceptFollower(matheus);
        pedrozzneo.blockFollower(matheus);
        lucas.acceptFollower(pedrozzneo);

        pedrozzneo.publish("1");
        lucas.clapPost(0);
        lucas.clapPost(0);
        pedrozzneo.publish("2");
        pedrozzneo.publish("3");
        pedrozzneo.publish("4");
        pedrozzneo.delete(2);
    }
}
