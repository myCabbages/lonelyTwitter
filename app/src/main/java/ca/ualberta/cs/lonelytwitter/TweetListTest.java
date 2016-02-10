package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by jinxin3 on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        //assertTrue(Boolean.FALSE);
        //try {
        //  fail()
        //} catch
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));

        if (tweets.hasTweet(tweet)){

        }
    }

    public void testHasTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        tweets.hasTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }
}
