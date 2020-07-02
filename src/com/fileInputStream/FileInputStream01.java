package com.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *FileInputStream 继承超类 InputStream（字节输入流）
 *
 */
public class FileInputStream01 {
    public static void main(String[] args) throws IOException {
        read01();
        read02();
    }

    /**
     *一次只能读取一个字节 int read（）读到结束返回-1
     * @throws IOException
     */
    private static void read01() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("c.txt"));
        int len = 0;
        while ((len = fileInputStream.read())!=-1){
            System.out.print(len);

        }
        System.out.println("\n");
        fileInputStream.close();
    }

    /**
     * 一次多个字节，用字节数组 int read（byte[]），有就返回有效字节个数，没有返回-1
     * @throws IOException
     */
    private static void read02() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("c.txt"));
        int len = 0;
        byte []bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));

        }
        fileInputStream.close();
    }

}
