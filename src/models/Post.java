package models;

import java.time.LocalDate;

public class Post {
    private String quote;
    private LocalDate date;
    private int claps;
    private int boos;

    public Post(String quote) {
        this.quote = quote;
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

    public void setClaps(int claps) {
        this.claps = claps;
    }

    public void setBoos(int boos) {
        this.boos = boos;
    }
}
