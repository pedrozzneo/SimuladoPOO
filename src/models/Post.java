package models;

import java.time.LocalDate;

public class Post {
    private String quote;
    private LocalDate date;
    private int claps;
    private int boos;
    private UserAccount user;

    public Post(UserAccount user, String quote) {
        this.quote = quote;
        this.user = user;
        date = LocalDate.now();
        claps = 0;
        boos = 0;
    }

    public String getQuote() {
        return quote;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getClaps() {
        return claps;
    }

    public int getBoos() {
        return boos;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String show(){
        return String.format("\n%s - %s \n  '%s' \nclaps: %d  boos: %d\n", user.getUsername(), date.toString(), quote, claps, boos);
    }
}
