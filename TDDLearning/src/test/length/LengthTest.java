package length; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** 
* Length Tester. 
* 
* @author hongboxiang
* @since <pre>四月 29, 2016</pre> 
* @version 1.0 
*/ 
public class LengthTest {

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    }

	@Test
	public void test_1_meter_equals_1_meter() {
		assertTrue(new M(1).eq(new M(1)));
	}

	@Test
	public void test_1_meter_not_equals_2_meter() {
		assertFalse(new M(1).eq(new M(2)));
	}

	@Test
	public void test_1_centimeter_equals_1_centimeter() {
		assertTrue(new CM(1).eq(new CM(1)));
	}

	@Test
	public void test_1_centimeter_not_equals_2_centimeter() {
		assertFalse(new CM(1).eq(new CM(2)));
	}

	@Test
	public void test_1_meter_equals_100_centimeter() {
		assertTrue(new M(1).eq(new CM(100)));
	}

	@Test
	public void test_1_meter_not_equals_200_centimeter() {
		assertFalse(new M(1).eq(new CM(200)));
	}

	@Test
	public void test_1_meter_equals_10_decimeter() {
		assertTrue(new M(1).eq(new DM(10)));
	}

	@Test
	public void test_1_decimeter_not_equals_1_centimeter() {
		assertFalse(new DM(1).eq(new CM(1)));
	}

	@Test
	public void test_1_meter_less_than_20_decimeter() {
		assertTrue(new M(1).lt(new DM(20)));
	}

	@Test
	public void test_2_decimeter_great_than_10_centimeter() {
		assertTrue(new DM(2).gt(new CM(10)));
	}

	@Test
	public void test_101_centimeter_equals_1m1cm() {
		assertThat(new CM(101).convert(), is("1m1cm"));
	}

	@Test
	public void test_123_decimeter_equals_12m3cm() {
		assertThat(new DM(123).convert(), is("12m3dm"));
	}

	@Test
	public void test_1米加1米等于2m() {
		assertThat(new M(1).add(new M(1)), is("2m"));
	}

	@Test
	public void test_1米加11分米等于2m1dm() {
		assertThat(new M(1).add(new DM(11)), is("2m1dm"));
	}
}
