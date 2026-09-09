import models.Post;
import models.UserAccount;

public class Main {
    static void main() {

        UserAccount pedrozzneo = new UserAccount("pedrozzneo@gmail.com", "pedrozzneo");
        Post post = new Post(pedrozzneo, "test");
        System.out.println(post.show());
    }
}
