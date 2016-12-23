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
* @since <pre>Ò»ÔÂ 22, 2016</pre> 
* @version 1.0 
*/ 
public class RentTest {
    List<Machine> carList = new ArrayList<Machine>();
@Before
public void before() throws Exception {
    Machine car = new Car();
    car.setId(1);
    car.setBrand("AUDI");
    car.setName("A6");
    car.setSeatCount(5);
    car.setDriveType("electric_power");
    car.setType("bus");
    carList.add(car);
} 

@After
public void after() throws Exception { 
}

/** 
* 
* Method: getMachineBySeatCount(List<Machine> machineListList, int count) 
* 
*/ 
@Test
public void should_get_when_want_seatCount_can_find() throws Exception {
    Rent rent = new Rent();
    assertThat(rent.getMachineBySeatCount(carList, 5).getId(), is(1));
}

/**
 *
 * Method: getMachineBySeatCount(List<Machine> machineListList, int count)
 *
 */
@Test
public void should_get_null_when_want_seatCount_can_not_find() throws Exception {
    Rent rent = new Rent();
    assertNull(rent.getMachineBySeatCount(carList, 7));
}

    /**
* 
* Method: getMachineByBrand(List<Machine> machineList, String brand) 
* 
*/ 
@Test
public void should_get_when_want_brand_can_find() throws Exception {
    Rent rent = new Rent();
    assertThat(rent.getMachineByBrand(carList, "AUDI").getId(), is(1));
}

/**
 *
 * Method: getMachineByBrand(List<Machine> machineList, String brand)
 *
 */
@Test
public void should_get_null_when_want_brand_can_not_find() throws Exception {
    Rent rent = new Rent();
    assertNull(rent.getMachineByBrand(carList, "no"));
}

/**
* 
* Method: getMachineByDriveType(List<Machine> machineList, String driveType) 
* 
*/ 
@Test
public void should_get_when_want_driveType_can_find() throws Exception {
    Rent rent = new Rent();
    assertThat(rent.getFirstMachineByDriveType(carList, "electric_power").getId(), is(1));
}

/**
 *
 * Method: getMachineByDriveType(List<Machine> machineList, String driveType)
 *
 */
@Test
public void should_get_null_when_want_driveType_can_not_find() throws Exception {
    Rent rent = new Rent();
    assertNull(rent.getFirstMachineByDriveType(carList, "no_power").getName());

}


} 
