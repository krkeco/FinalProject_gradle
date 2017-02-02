package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    EndpointsAsyncTask epasync;

    @Test
    public void useASyncTask() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        epasync = new EndpointsAsyncTask();
        assertNotNull("hi",epasync.execute(new Pair<Context, String>(appContext, "hi")));


    }
}
