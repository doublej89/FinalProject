package com.udacity.gradle.builditbigger;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class AsyncTaskTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mainActivity;
    private EndpointsAsyncTask endpointsAsyncTask;

    public AsyncTaskTest(){
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception{
        super.setUp();
        mainActivity = getActivity();
        endpointsAsyncTask = new EndpointsAsyncTask();
    }

    @MediumTest
    public void testStringValue(){
        String result = endpointsAsyncTask.doInBackground(mainActivity);
        assertTrue(result != null);
    }
}