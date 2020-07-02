package com.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) throws IOException {
        writer01();
        writer02();
    }

    /**
     * 字符流的写字符
     * @throws IOException
     */
    private static void writer01() throws IOException {
        FileWriter fileWriter = new FileWriter("e.txt");
        char []chars = {'s','w','v','t'};
        //写单个字符
        fileWriter.write('你');
        fileWriter.flush();
        //写多个字符
        fileWriter.write(chars);
        fileWriter.write(chars,2,2);
        //写字符串
        fileWriter.write("罪过和尚");
        fileWriter.write("美丽的姑娘",3,2);

        fileWriter.close();

    }
    /**
     * 字符流的续写与换行与字节流的一样 true windows \r\n linux \r
     * @throws IOException
     */
    private static void writer02() throws IOException {
        FileWriter fileWriter = new FileWriter("e.txt",true);
        char []chars = {'s','w','v','t'};
        //写单个字符
        fileWriter.write('你');
        fileWriter.write("\r\n");
        fileWriter.flush();
        //写多个字符
        fileWriter.write(chars);
        fileWriter.write("\r\n");
        fileWriter.write(chars,2,2);
        fileWriter.write("\r\n");
        //写字符串
        fileWriter.write("罪过和尚");
        fileWriter.write("\r\n");
        fileWriter.write("美丽的姑娘",3,2);

        fileWriter.close();

    }
}
