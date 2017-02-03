package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Looper;
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

    @Test
    public void useASyncTask() {
        Context mContext = InstrumentationRegistry.getTargetContext();
        //Activity main = new MainActivity();
        Looper.prepare();

        assertNotNull(
                new EndpointsAsyncTask().execute(new Pair<Context, String>(mContext, "hi")));

    }
}
