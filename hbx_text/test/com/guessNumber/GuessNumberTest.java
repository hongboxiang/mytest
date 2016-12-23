package com.guessNumber; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** 
* GuessNumber Tester. 
* 
* @author hongboxiang
* @since <pre>���� 23, 2016</pre> 
* @version 1.0 
*/ 
public class GuessNumberTest { 

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    }

    @Test
    public void �����93ʱ_�û���50_��ʾ_С��() throws Exception {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.compare(93,50),is("С��"));

    }

    @Test
    public void �����93ʱ_�û���96_��ʾ_����() throws Exception {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.compare(93,96),is("����"));

    }

    @Test
    public void �����93ʱ_�û���93_��ʾ_����() throws Exception {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.compare(93,93),is("����"));

    }
    
        
}
