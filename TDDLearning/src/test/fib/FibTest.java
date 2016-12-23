package fib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/** 
* Fib Tester. 
* 
* @author hongboxiang
* @since <pre>ËÄÔÂ 29, 2016</pre> 
* @version 1.0 
*/ 
public class FibTest { 
	Fib fib = new Fib();

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    } 

	@Test
	public void should_get_0_when_input_0() throws Exception {
		assertThat(fib.cal(0), is(0L));
	}

	@Test
	public void should_get_1_when_input_1() throws Exception {
		assertThat(fib.cal(1), is(1L));
	}

	@Test
	public void should_get_1_when_input_2() throws Exception {
		assertThat(fib.cal(2), is(1L));
	}

	@Test
	public void should_get_2_when_input_3() throws Exception {
		assertThat(fib.cal(3), is(2L));
	}

	@Test
	public void should_get_6765_when_input_20() throws Exception {
		assertThat(fib.cal(20), is(6765L));
	}

	@Test
	public void should_get_23416728348467685_when_input_80() throws Exception {
		assertThat(fib.cal(80), is(23416728348467685L));
	}
}
