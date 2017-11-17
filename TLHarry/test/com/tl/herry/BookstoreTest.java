package com.tl.herry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created on 2017/10/30
 */
public class BookstoreTest {
    int[] bookBusket;
    Bookstore bookstore;

    @Before
    public void setUp() throws Exception {
        bookstore = new Bookstore();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void should_right_when_buy_1_0_0_0_0() throws Exception {
        bookBusket = new int[]{1, 0, 0, 0, 0};
        assertThat(bookstore.calBestPrice(bookBusket), is(8.0));
    }

    @Test
    public void should_right_when_buy_0_0_0_0_0() throws Exception {
        bookBusket = new int[]{0, 0, 0, 0, 0};
        assertThat(bookstore.calBestPrice(bookBusket), is(0.0));
    }

    @Test
    public void should_right_when_buy_1_1_0_0_0() throws Exception {
        bookBusket = new int[]{1, 1, 0, 0, 0};
        assertThat(bookstore.calBestPrice(bookBusket), is(15.2));
    }

    @Test
    public void should_right_when_buy_2_0_0_0_0() throws Exception {
        bookBusket = new int[]{2, 0, 0, 0, 0};
        assertThat(bookstore.calBestPrice(bookBusket), is(16.0));
    }

    @Test
    public void should_right_when_buy_2_1_0_0_0() throws Exception {
        bookBusket = new int[]{2, 1, 0, 0, 0};
        assertThat(bookstore.calBestPrice(bookBusket), is(23.2));
    }

    @Test
    public void should_right_when_buy_1_1_1_0_0() throws Exception {
        bookBusket = new int[]{1, 1, 1, 0, 0};
        assertThat(bookstore.calBestPrice(bookBusket), is(21.6));
    }

    @Test
    public void should_right_when_buy_1_1_1_1_0() throws Exception {
        bookBusket = new int[]{1, 1, 1, 1, 0};
        assertThat(bookstore.calBestPrice(bookBusket), is(25.6));
    }

    @Test
    public void should_right_when_buy_1_1_1_1_1() throws Exception {
        bookBusket = new int[]{1, 1, 1, 1, 1};
        assertThat(bookstore.calBestPrice(bookBusket), is(30.0));
    }

    @Test
    public void should_right_when_buy_2_2_2_1_1() throws Exception {
        bookBusket = new int[]{2, 2, 2, 1, 1};
        assertThat(bookstore.calBestPrice(bookBusket), is(51.2));
    }

    @Test
    public void should_right_when_buy_2_1_2_1_2() throws Exception {
        bookBusket = new int[]{2, 1, 2, 1, 2};
        assertThat(bookstore.calBestPrice(bookBusket), is(51.2));
    }

    @Test
    public void should_get_exception_when_bookBusket_length_is_6() throws Exception {
        bookBusket = new int[]{1,1,1,1,1,1};
        try {
            bookstore.calBestPrice(bookBusket);
            assertTrue(false);
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), is("bookBusket is incorrect."));
        }
    }

    @Test
    public void should_get_exception_when_bookBusket_contain_negative() throws Exception {
        bookBusket = new int[]{-1,1,1,1,1};
        try {
            bookstore.calBestPrice(bookBusket);
            assertTrue(false);
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), is("bookBusket is incorrect."));
        }
    }

    @Test
    public void should_get_exception_when_bookBusket_is_null() throws Exception {
        try {
            bookstore.calBestPrice(null);
            assertTrue(false);
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), is("bookBusket is incorrect."));
        }
    }
}
