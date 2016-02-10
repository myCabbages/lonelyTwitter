package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by kx on 2016-01-14.
 */
public class good extends baseMood {
    public good(Date date, String mood, ArrayList<String> moodList) {
        super(date, mood, moodList);
        super.setMood("good");
        moodList.add(mood);
    }
}
