package com.pattarn.factory.goldCode;

import com.pattarn.factory.goldCode.domain.Machine;
import com.pattarn.factory.goldCode.factory.BusFactory;
import com.pattarn.factory.goldCode.factory.CarFactory;
import com.pattarn.factory.goldCode.factory.MachineFactory;

import java.util.List;

/**
 * Created by 10180885 on 16-1-21.
 */
public class Rent {

    public static void main(String[] args) {
        MachineFactory carFactory = new CarFactory();
        MachineFactory busfactory = new BusFactory();
        List<Machine> carList = carFactory.create(10);
        List<Machine> busList = busfactory.create(10);
        Rent rent = new Rent();
        Machine machine1 = rent.getMachineBySeatCount(carList, 6);
        Machine machine2 = rent.getMachineByBrand(carList, "Passat");
        Machine machine3 = rent.getFirstMachineByDriveType(busList, "electric_power");

        System.out.println("------------1-----------------");
        if(machine1 != null){
            System.out.println(machine1.getInfo());
        }else {
            System.out.println("not find lalala~");
        }

        System.out.println("------------2-----------------");
        if(machine2 != null){
            System.out.println(machine2.getInfo());
        }else {
            System.out.println("not find lalala~");
        }

        System.out.println("------------3-----------------");
        if(machine3 != null){
            System.out.println(machine3.getInfo());
        }else {
            System.out.println("not find lalala~");
        }
    }

    public Machine getMachineBySeatCount(List<Machine> machineListList, int count) {
        if (null != machineListList && machineListList.size() > 0) {
            for (Machine machine : machineListList) {
                if (machine.getSeatCount() >= count) {
                    return machine;
                }
            }
        }
        return null;
    }

    public Machine getMachineByBrand(List<Machine> machineList, String brand) {
        if (null != machineList && machineList.size() > 0) {
            for (Machine machine : machineList) {
                if (machine.getBrand().equalsIgnoreCase(brand)) {
                    return machine;
                }
            }
        }
        return null;
    }

    public Machine getFirstMachineByDriveType(List<Machine> machineList, String driveType) {
        Machine result = new Machine();
        if (null != machineList && machineList.size() > 0) {
            for (Machine machine : machineList) {
                if (machine.getDriveType().equalsIgnoreCase(driveType)) {
                    if(machine.getId() < result.getId()) {
                        result = machine;
                    }
                }
            }
        }
        return result.getId() == 0 ? null : result;
    }
}
