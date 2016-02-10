package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by kx on 2016-01-14.
 */
public abstract class baseMood {
    private Date date;
    private String mood;
    ArrayList<String> moodList = new ArrayList<String>();

    public baseMood(Date date, String mood, ArrayList<String> moodList) {
        this.date = date;
        this.mood = mood;
        this.moodList = moodList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public ArrayList<String> getMoodList() {
        return moodList;
    }

    public void setMoodList(ArrayList<String> moodList) {
        this.moodList = moodList;
    }
}
