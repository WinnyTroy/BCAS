package com.troy.bcas;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {

//    Setting up a rule that
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

//    test that checks that what has been typed in is what is in the text area
    @Test
    public void validateEditText(){
        onView(withId(R.id.text1)).perform(typeText("Nairobi"))
                .check(matches(withText("Nairobi")));
    }

//    Test that simply instructs espresso on what to do
    @Test
    public void locationIsSentToSalonActivity(){
        String location = "Nairobi";
        onView(withId(R.id.text1)).perform(typeText(location));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.base)).check(matches(withText(location)));
    }


}
