package com.pattarn.factory.goldCode.factory;

import com.pattarn.factory.goldCode.domain.Bus;
import com.pattarn.factory.goldCode.domain.Machine;
import com.pattarn.factory.goldCode.util.Enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 10180885 on 16-1-22.
 */
public class BusFactory extends MachineFactory{
    @Override
    public List<Machine> create(int sum) {
        List<Machine> busList = new ArrayList<Machine>();
        Random random = new Random();
        for (int index = 0; index < sum; index++) {
            Machine bus = new Bus();
            bus.setId(index + 1);
            bus.setBrand(Enums.random(Brand.class).toString());
            bus.setName(Enums.random(Name.class).toString());
            bus.setSeatCount(random.nextInt(6)+2);
            bus.setDriveType(Enums.random(DriveType.class).toString());
            bus.setType("bus");
            busList.add(bus);
            bus.showInfo();
        }
        return busList;
    }


}
