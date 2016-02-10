package ca.ualberta.cs.lonelytwitter;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.TextView;

/**
 * Created by sajediba on 2/8/16.
 */
public class IntentReaderActivityTest extends ActivityInstrumentationTestCase2{

    public IntentReaderActivityTest() {
        super(IntentReaderActivity.class);
    }

    //
    //
    public void testSendText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 1");

        setActivityIntent(intent);
        IntentReaderActivity Ira = (IntentReaderActivity) getActivity();

        assertEquals("IntentReaderActivity should get the text from intent",
                "message 1", Ira.getText());
    }

    public void testDisplayText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 2");

        setActivityIntent(intent);
        IntentReaderActivity Ira = (IntentReaderActivity) getActivity();

        TextView textView = (TextView) Ira.findViewById(R.id.intentText);
        assertEquals("This txt should be displayed", "message 2",
                textView.getText().toString());

    }

    public void testDoubleText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 3");
        intent.putExtra(IntentReaderActivity.MODE_OF_TRANSFORM_KEY,
                IntentReaderActivity.DOUBLE);

        setActivityIntent(intent);
        IntentReaderActivity Ira = (IntentReaderActivity) getActivity();
        assertEquals("This text should be repeated twice", "message 3message 3",
                Ira.getText());
    }

    public void testReverseText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 4");
        intent.putExtra(IntentReaderActivity.MODE_OF_TRANSFORM_KEY,
                IntentReaderActivity.REVERSE);

        setActivityIntent(intent);
        IntentReaderActivity Ira = (IntentReaderActivity) getActivity();
        assertEquals("This text should be reversed", "4 egassem",
                Ira.getText());
    }

    public void testDefaultText(){
        Intent intent = new Intent();
//        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "");

        setActivityIntent(intent);
        IntentReaderActivity Ira = (IntentReaderActivity) getActivity();
        assertEquals("This text should print out default text instead", "default text",
                Ira.getText());
    }

    public void testOnScreen(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 5");

        setActivityIntent(intent);
        IntentReaderActivity Ira = (IntentReaderActivity) getActivity();
        TextView textView = (TextView) Ira.findViewById(R.id.intentText);
        ViewAsserts.assertOnScreen(Ira.getWindow().getDecorView(), textView);

    }
    //
    //

    //TODO: Add your code here ...
//-------------------------------------------------------------------------------

//-------------------------------------------------------------------------------
}
