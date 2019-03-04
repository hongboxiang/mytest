package com.dirmanage.context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 2019/3/2
 */
public class DirContextTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void saveDirGetTest() {
        DirLoader.load();
        assertThat(DirContext.getInstance().getSaveDir(), is("./"));
    }
}