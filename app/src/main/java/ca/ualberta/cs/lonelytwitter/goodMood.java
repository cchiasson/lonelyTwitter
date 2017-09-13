package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by chias on 2017-09-12.
 */

public class goodMood extends Mood implements IsMood {
    public goodMood() {
        super();
    }
    public goodMood(Date date) {
        super(date);
    }
    public String ShowMood() {
        return "Good";
    }
}
