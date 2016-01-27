package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by jinxin3 on 1/26/16.
 */
public class TweetLab4Test extends ActivityInstrumentationTestCase2 {

    public TweetLab4Test(){
        super(LonelyTwitterActivity.class);
    }

    public void testAdd() {
        TweetLab4 tweets = new TweetLab4();
        Tweet tweet = new NormalTweet("Test lab4");

        tweets.addTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGet(){
        TweetLab4 tweets = new TweetLab4();
        Tweet tweet = new NormalTweet("Test lab4");

        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweets(0);

        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testHas(){
        TweetLab4 tweets = new TweetLab4();
        Tweet tweet = new NormalTweet("Test lab4");

        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        tweets.hasTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testRemove(){
        TweetLab4 tweets = new TweetLab4();
        Tweet tweet = new NormalTweet("Test lab4");

        tweets.addTweet(tweet);
        tweets.removeTweet(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetLab4 tweets = new TweetLab4();
        Tweet tweet = new NormalTweet("Test lab4");

        assertEquals(tweets.getCount(), tweets.size);
    }




}
