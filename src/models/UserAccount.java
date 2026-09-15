package models;

public class UserAccount {
    private String email;
    private String username;

    private final UserAccount[] followers;
    private int followerSize;

    private final Post[] timeline;
    private int timeLineSize;
    private int timelineNextIndex;

    private final Post[] posts;
    private int postsCount;

    public UserAccount(String email, String username) {
        this.email = email;
        this.username = username;
        followers = new UserAccount[1000];
        timeline = new Post[10];
        posts = new Post[1000];
    }

    public void acceptFollower(UserAccount newFollower){
        followers[followerSize] = newFollower;
        followerSize++;
    }

    public void blockFollower(UserAccount follower){
        if(followerSize == 0){
            return;
        }

        for (int i = 0; i < followerSize; i++) {
            if(followers[i].equals(follower)){
                for (int j = i; j < followerSize - 1; j++) {
                    followers[j] = followers[j+1];
                }
                followers[followerSize-1] = null;
                followerSize--;
            }
        }
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
        posts[postsCount-1] = null;
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
