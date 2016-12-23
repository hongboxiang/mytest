package com.ftpDLog.util;

import com.ftpDLog.util.FtpUtil;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static junit.framework.Assert.assertTrue;

public class FtpUtilTest {

    @Test
    public void testConnectToFtp() throws Exception {
        assertTrue(FtpUtil.connectToFtp());
    }


    @Test
    public void testConnect2Sftp() throws Exception {
        assertTrue(FtpUtil.connect2Sftp());
    }

} 
