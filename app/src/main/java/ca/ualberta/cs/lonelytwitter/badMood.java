package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by chias on 2017-09-12.
 */

public class badMood extends Mood implements IsMood {
    public badMood() {
        super();
    }
    public badMood(Date date) {
        super(date);
    }
    public String ShowMood() {
        return "Bad";
    }
}
