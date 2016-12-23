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
* @since <pre>二月 23, 2016</pre> 
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
    public void 随机出93时_用户猜50_显示_小了() throws Exception {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.compare(93,50),is("小了"));

    }

    @Test
    public void 随机出93时_用户猜96_显示_大了() throws Exception {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.compare(93,96),is("大了"));

    }

    @Test
    public void 随机出93时_用户猜93_显示_中了() throws Exception {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.compare(93,93),is("中了"));

    }
    
        
}
