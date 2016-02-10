package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by jinxin3 on 1/26/16.
 */
public class TweetLab4 {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    protected int count;
    public int size = tweets.size();

    public void addTweet(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("Threw an IllegalArgumentException");
        }
        else{
            tweets.add(tweet);
            count ++;
        }
    }

    public Tweet getTweets(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){
        return  tweets.contains(tweet);
    }

    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        return count;
    }
}
