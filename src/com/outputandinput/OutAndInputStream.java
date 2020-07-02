package com.outputandinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制，一读一写
 */
public class OutAndInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\kt20180311\\Pictures\\Saved Pictures\\C.png"));
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\C.png"));
        int len = 0;
        byte [] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
