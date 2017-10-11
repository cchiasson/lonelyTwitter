package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by chias on 2017-10-10.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    //add tweet to a list of tweets
    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        if (HasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    //delete tweet from list of tweets
    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    //check if a list of tweets has the specified tweet
    //if so, return true, otherwise false
    public boolean HasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet GetTweet(int index) {
        return tweets.get(index);
    }

    public int GetCount() {
        return tweets.size();
    }

    public ArrayList<Tweet> GetTweets() {
        private ArrayList<Tweet> sortedTweets = 
        return sortedTweets;
    }


}
