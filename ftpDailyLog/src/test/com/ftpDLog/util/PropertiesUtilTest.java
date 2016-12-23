package com.ftpDLog.util;

import com.ftpDLog.util.PropertiesUtil;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PropertiesUtilTest { 

    @Test
    public void testGetKeyValue() throws Exception {
        assertThat(PropertiesUtil.getKeyValue("IP"),is("10.92.243.27"));
        assertThat(PropertiesUtil.getKeyValue("PORT"),is("22"));
        assertThat(PropertiesUtil.getKeyValue("USERNAME"),is("root"));
        assertThat(PropertiesUtil.getKeyValue("PASSWORD"),is("LteSon123"));
        assertThat(PropertiesUtil.getKeyValue("FTPTYPE"),is("sftp"));
    }

} 
