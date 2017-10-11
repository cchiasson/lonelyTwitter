package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by chias on 2017-10-10.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.HasTweet(myTweet));
    }

    public void testDeleteTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        tweets.deleteTweet(myTweet);

        assertFalse(tweets.HasTweet(myTweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse(tweets.HasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.HasTweet(myTweet));
    }

    public void testGetTweet() {
        //take index and return tweet at that index

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        Tweet returnedTweet = tweets.GetTweet(0);

        assertEquals(returnedTweet.getMessage(),myTweet.getMessage());

        assertEquals(returnedTweet.getDate(),myTweet.getDate());

    }

    public void testGetCount() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        assertEquals(tweets.GetCount(),1);
    }
}
