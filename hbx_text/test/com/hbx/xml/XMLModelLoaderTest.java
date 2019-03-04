package com.hbx.xml;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created on 2017/12/6
 */
public class XMLModelLoaderTest {
    XMLModelLoader xmlModelLoader = new XMLModelLoader();

    @Test
    public void parse() throws Exception {
        List<MoModel> moModels = xmlModelLoader.parse("./conf/LcsField.xml");
        System.out.println("");
    }
}
