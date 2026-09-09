package models;

public class UserAccount {
    private String email;
    private String username;
    private final UserAccount[] followers = new UserAccount[1000];
    private int followerSize = 0;
    private Post[] timeline = new Post[10];
    private int timeLineSize = 0;
    private int timelineNextIndex = 0;
    private Post[] posts = new Post[1000];
    private int postsCount = 0;

    public UserAccount(String email, String username) {
        this.email = email;
        this.username = username;
    }

    public void acceptFollower(UserAccount newFollower){
        followers[followerSize] = newFollower;
        followerSize++;
    }

    public void clapPost(int postIdx){
        if(postIdx >= timeLineSize){
            return;
        }
        timeline[postIdx].clap();
    }

    public void booPost(int postIdx){
        if(postIdx >= timeLineSize){
            return;
        }
        timeline[postIdx].boo();
    }

    public void delete(int postIdx){
        if(postsCount == 0){
            return;
        }

        for (int i = postIdx; i < postsCount - 1; i++) {
            posts[i] = posts[i + 1];
        }
        postsCount--;
    }

    public void updateTimeline(Post newPost){
        for (int i = 0; i < followerSize; i++) {
            if(timelineNextIndex < 10){
                followers[i].timeline[followers[i].timelineNextIndex] = newPost;
                followers[i].timelineNextIndex++;
                followers[i].timeLineSize++;
            }
            else{
                followers[i].timeline[0] = newPost;
                followers[i].timelineNextIndex = 1;
            }
        }
    }

    public void publish(String quote){
        Post post = new Post(this, quote);
        posts[postsCount] = post;
        postsCount++;

        updateTimeline(post);
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
