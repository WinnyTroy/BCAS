package com.troy.bcas;

import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertTrue;

@Config(constants = BuildConfig.class,sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

//    sets up environment before actually beginning the test
    @Before
    public void setup(){
        activity = Robolectric.setupActivity(MainActivity.class);
    }

//Setting up a test that will obtain details from the text view in our main activity
    @Test
    public void validateTextViewContent(){
        TextView textView = (EditText) activity.findViewById(R.id.text1);
        assertTrue("Hey".equals(textView.getText().toString()));
    }

}
