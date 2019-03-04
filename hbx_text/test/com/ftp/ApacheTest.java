package com.ftp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created on 2018/6/7
 */
public class ApacheTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void test() throws Exception {
        Apache apache = new Apache("10.92.243.28", 21, 0, "root", "LteSon123");
        apache.get("test.txt","D:\\test.txt");
        System.out.println("DataConnectionMode: " + apache.getDataConnectionMode());

//        Ftp4j ftp4j = new Ftp4j("10.92.243.28", 21, 0, "root", "LteSon123");
//        ftp4j.get("test.txt","D:\\test.txt");
//        System.out.println("isPassive: " + ftp4j.isPassive());
    }

}