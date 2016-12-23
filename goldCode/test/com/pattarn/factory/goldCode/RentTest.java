package com.pattarn.factory.goldCode;

import com.pattarn.factory.goldCode.domain.Car;
import com.pattarn.factory.goldCode.domain.Machine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Rent Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ò»ÔÂ 22, 2016</pre>
 */
public class RentTest {
    List<Machine> carList = new ArrayList<Machine>();
    List<Machine> sizeIs0List = new ArrayList<Machine>();
    Rent rent = new Rent();

    @Before
    public void before() throws Exception {
        Machine car1 = new Car();
        car1.setId(1);
        car1.setBrand("AUDI");
        car1.setName("A6");
        car1.setSeatCount(5);
        car1.setDriveType("electric_power");
        car1.setType("car");
        carList.add(car1);

        Machine car2 = new Car();
        car2.setId(1);
        car2.setBrand("AUDI");
        car2.setName("A6");
        car2.setSeatCount(4);
        car2.setDriveType("electric_power");
        car2.setType("car");
        carList.add(car2);
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void should_get_when_want_seatCount_can_find() throws Exception {
        assertThat(rent.getOneMachineBySeatCount(carList, 5).getId(), is(2));
    }


    @Test
    public void should_get_null_when_want_seatCount_can_not_find() throws Exception {
        assertNull(rent.getOneMachineBySeatCount(carList, 7));
    }


    @Test
    public void should_get_null_when_want_seatCount_list_size_is_0() throws Exception {
        assertNull(rent.getOneMachineBySeatCount(sizeIs0List, 5));
    }


    @Test
    public void should_get_when_want_brand_can_find() throws Exception {
        assertThat(rent.getOneMachineByBrand(carList, "AUDI").getId(), is(1));
    }


    @Test
    public void should_get_null_when_want_brand_can_not_find() throws Exception {
        assertNull(rent.getOneMachineByBrand(carList, "no"));
    }


    @Test
    public void should_get_null_when_wanSt_brand_list_size_is_0() throws Exception {
        assertNull(rent.getOneMachineByBrand(sizeIs0List, "AUDI"));
    }


    @Test
    public void should_get_when_want_driveType_can_find() throws Exception {
        assertThat(rent.getOneMachineByDriveType(carList, "electric_power").getId(), is(1));
    }


    @Test
    public void should_get_null_when_want_driveType_can_not_find() throws Exception {
        assertNull(rent.getOneMachineByDriveType(carList, "no_power"));
    }


    @Test
    public void should_get_null_when_want_driveType_list_size_is_0() throws Exception {
        assertNull(rent.getOneMachineByDriveType(sizeIs0List, "electric_power"));
    }


    @Test
    public void should_get_when_want_driveType_electric_power_seatCount_5_can_find() throws Exception {
        assertThat(rent.getMachineListBySeatCountAndDriveType(carList, 5, "electric_power").get(0).getId(), is(1));
    }

    @Test
    public void should_get_null_when_want_driveType_electric_power_seatCount_8_can_not_find() throws Exception {
        assertThat(rent.getMachineListBySeatCountAndDriveType(carList, 8, "electric_power").size(), is(0));
    }

    @Test
    public void should_get_null_when_want_driveType_electric_power_seatCount_5_list_size_is_0() throws Exception {
        assertThat(rent.getMachineListBySeatCountAndDriveType(sizeIs0List, 5, "electric_power").size(), is(0));
    }
} 
