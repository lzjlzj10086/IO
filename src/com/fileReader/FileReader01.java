package com.fileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 *  字符输入流FileReader 继续 超类Reader
 */
public class FileReader01 {
    public static void main(String[] args) throws IOException {
        reader01();
        reader02();
    }

    /**
     * 单个字符读取
     */
    private static void reader01() throws IOException {
        FileReader fileReader = new FileReader("d.txt");
        int len = 0;
        while((len = fileReader.read())!=-1){
            System.out.print((char)len);
        }
        System.out.print("\n");
        fileReader.close();
    }
    /**
     * 多个个字符读取
     */
    private static void reader02() throws IOException {
        FileReader fileReader = new FileReader("d.txt");
        int len = 0;
        char []chars = new char[1024];
        while((len = fileReader.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        fileReader.close();
    }
}
