package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.text.Editable;
import android.widget.EditText;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * Runs before starting test
     * @throws Exception
     */
    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void testTweet() {
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "Test tweet");
        solo.clickOnButton("Save");

        solo.enterText((EditText) solo.getView(R.id.body), "");
        assertTrue(solo.waitForText("Test tweet"));
        solo.clickOnButton("Clear");

    }

    public void testClickTweetList() {

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView((R.id.body)), "Tweet");
        solo.clickOnButton("Save");
        solo.enterText((EditText) solo.getView((R.id.body)), "");
        solo.waitForText("Tweet");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity",EditTweetActivity.class);
    }

    /**
     * Runs after test
     * @throws Exception
     */
    @Override
    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }
}