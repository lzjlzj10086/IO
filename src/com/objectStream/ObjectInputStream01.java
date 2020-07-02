package com.objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(object);
    }
}
