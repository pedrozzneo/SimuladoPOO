package models;

public class UserAccount {
    private String email;
    private String username;
    private final UserAccount[] followers = new UserAccount[10];
    private Post[] timeline = new Post[1000];
    private Post[] posts = new Post[1000];

    public UserAccount(String email, String username) {
        this.email = email;
        this.username = username;
    }

    public String getEmail(){
        return email;
    }

    public String getUsername(){
        return username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
