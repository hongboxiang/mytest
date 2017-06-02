package com.pattarn.factory.goldCode.factory;

import com.pattarn.factory.goldCode.domain.Car;
import com.pattarn.factory.goldCode.domain.Machine;
import com.pattarn.factory.goldCode.util.Enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 10180885 on 16-1-22.
 */
public class CarFactory extends MachineFactory{
    @Override
    public List<Machine> create(int sum) {
        List<Machine> carList = new ArrayList<Machine>();
        Random random = new Random();
        for (int index = 0; index < sum; index++) {
            Machine car = new Car();
            car.setId(index + 1);
            car.setBrand(Enums.random(Brand.class).toString());
            car.setName(Enums.random(Name.class).toString());
            car.setSeatCount(random.nextInt(6)+2);
            car.setDriveType(Enums.random(DriveType.class).toString());
            car.setType("car");
            carList.add(car);
            car.showInfo();
        }
        return carList;
    }
}
