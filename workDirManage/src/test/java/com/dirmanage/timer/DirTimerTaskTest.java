package com.dirmanage.timer;

import com.dirmanage.context.DirLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created on 19-3-4
 */
public class DirTimerTaskTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void moveTest() {
        DirLoader.load();
        new DirTimerTask().run();
    }
}