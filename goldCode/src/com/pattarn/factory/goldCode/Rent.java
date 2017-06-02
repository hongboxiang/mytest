package com.pattarn.factory.goldCode;

import com.pattarn.factory.goldCode.domain.Machine;
import com.pattarn.factory.goldCode.factory.BusFactory;
import com.pattarn.factory.goldCode.factory.CarFactory;
import com.pattarn.factory.goldCode.factory.MachineFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10180885 on 16-1-21.
 */
public class Rent {

    public static void main(String[] args) {
        MachineFactory carFactory = new CarFactory();
        MachineFactory busfactory = new BusFactory();
        List<Machine> carList = carFactory.create(1);
        List<Machine> busList = busfactory.create(1);

        Rent rent = new Rent();
        Machine machine1 = rent.getOneMachineBySeatCount(carList, 5);
        Machine machine2 = rent.getOneMachineByBrand(carList, "Passat");
        Machine machine3 = rent.getOneMachineByDriveType(busList, "electric_power");

        System.out.println("------------1.在轿车的信息列表中，查找一个可以乘坐5人的轿车；-----------------");
        System.out.println(machine1.getInfo());

        System.out.println("------------2.在轿车的信息列表中，查找一个牌子为“Passat”的轿车；-----------------");
	    System.out.println(machine2.getInfo());

	    System.out.println("------------3.在大巴的信息列表中，查找第一个清洁能源（电力发动机）大巴；-----------------");
	    System.out.println(machine3.getInfo());
    }

    public Machine getOneMachineBySeatCount(List<Machine> machineList, int count){
        return getOne(getMachineListBySeatCount(machineList, count));
    }

    public Machine getOneMachineByBrand(List<Machine> machineList, String brand){
        return getOne(getMachineListByBrand(machineList, brand));
    }

    public Machine getOneMachineByDriveType(List<Machine> machineList, String driveType){
        return getOne(getMachineListByDriveType(machineList, driveType));
    }

    public List<Machine> getMachineListBySeatCountAndDriveType(List<Machine> machineListList, int count, String driveType) {
        return getMachineListByDriveType(getMachineListBySeatCount(machineListList, count), driveType);
    }

    public Machine getOne(List<Machine> machineList){
        if(machineList.size()>0) {
            return machineList.get(0);
        }
        else
            return Machine.newNull();
    }



    public List<Machine> getMachineListBySeatCount(List<Machine> machineList, int count) {
        List<Machine> result = new ArrayList<Machine>();
        if (machineList.size() > 0) {
            for (Machine machine : machineList) {
                if (machine.getSeatCount() >= count) {
                    result.add(machine);
                }
            }
        }
        return result;
    }

    public List<Machine> getMachineListByBrand(List<Machine> machineList, String brand) {
        List<Machine> result = new ArrayList<Machine>();
        if (machineList.size() > 0) {
            for (Machine machine : machineList) {
                if (machine.getBrand().equalsIgnoreCase(brand)) {
                    result.add(machine);
                }
            }
        }
        return result;
    }

    public List<Machine> getMachineListByDriveType(List<Machine> machineList, String driveType) {
        List<Machine> result = new ArrayList<Machine>();
        if (machineList.size() > 0) {
            for (Machine machine : machineList) {
                if (machine.getDriveType().equalsIgnoreCase(driveType)) {
                    result.add(machine);
                }
            }
        }
        return result;
    }

}
