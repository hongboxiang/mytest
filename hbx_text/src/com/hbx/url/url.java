package com.hbx.url;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by 10180885 on 2017/3/24.
 */
public class url {
    public static void main(String path[]) throws Exception {
        URL u=new URL("http://route.showapi.com/967-1?showapi_appid=34314&showapi_sign=066ad3abe6614a99a9bb6eb14c36fcae");
        InputStream in=u.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[]=new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[]=out.toByteArray( );
        System.out.println(new String(b,"utf-8"));
    }
}
