package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by kx on 2016-01-14.
 */
public class bad extends baseMood {
    public bad(Date date, String mood, ArrayList<String> moodList) {
        super(date, mood, moodList);
        super.setMood("bad");
        moodList.add(mood);
    }
}
