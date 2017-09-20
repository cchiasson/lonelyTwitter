package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by chias on 2017-09-12.
 */

public abstract class Tweet {
    private String message;
    private Date date;
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length()>140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage() {
        return this.message;
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
