package com.fileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream继承超类OutputStream
 * 使用：1.创建对象 2.使用对象方法 3.关闭资源
 * FileOutputStream构造方法
 *      1.FileOutputStream("a.txt");2.FileOutputStream(new File("b.txt"));
 *      3.FileOutputStream(new File("c.txt"),true);4..FileOutputStream("a.txt",true);true是开始追加写
 */
public class FileOutputStream01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(97);
        fos.close();
        wrietByte();
        wrietByte01();
    }

    /**
     *用字节数组方法写入
     * @throws IOException
     */
    public static void wrietByte() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("b.txt"));
        byte []bytes ="hello".getBytes();
        fileOutputStream.write(bytes);
        System.out.println(bytes);
        fileOutputStream.close();
    }

    /**
     * 追加写（续写）和换行（windows\r\n linux/r)
     * @throws IOException
     */
    public static void wrietByte01() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("c.txt"),true);
        byte []bytes ="java".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.write("\r\n".getBytes());
        System.out.println(bytes);
        fileOutputStream.close();
    }
}
