package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
<<<<<<< HEAD
 * Created by watts1 on 1/26/16.
=======
 * Created by jinxin3 on 1/26/16.
>>>>>>> 61260690b68c23f8b99220ec935786d0d313ae03
 */
public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
<<<<<<< HEAD
    }

    public boolean hasTweet(Tweet tweet){
=======

    }

    public boolean hasTweet(Tweet tweet) {
>>>>>>> 61260690b68c23f8b99220ec935786d0d313ae03
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

}
