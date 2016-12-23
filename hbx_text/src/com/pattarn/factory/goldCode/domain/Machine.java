package com.pattarn.factory.goldCode.domain;

/**
 * Created by 10180885 on 16-1-21.
 */
public class Machine {

    private int id = Integer.MAX_VALUE;
    private String name;
    private String type;
    private String brand;
    private int seatCount;
    private String driveType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getInfo() {
        String info;
        info = "This is what you want : Machine is " + getType() +
                " \nid : " + getId() +
                " \nBrand : " + getBrand() +
                " \nName : " + getName() +
                " \nSeatCount : " + getSeatCount() +
                " \nDriveType : " + getDriveType();
        return info;
    }

    public String showInfo() {
        String info;
        info = "list : a " + getType() +
                " | id : " + getId() +
                " | Brand : " + getBrand() +
                " | Name : " + getName() +
                " | SeatCount : " + getSeatCount() +
                " | DriveType : " + getDriveType();
        System.out.println(info);
        return info;
    }
}
