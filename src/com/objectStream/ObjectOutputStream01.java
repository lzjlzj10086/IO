package com.objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream01 {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
        objectOutputStream.writeObject(new Person("哆啦A梦",20));
        objectOutputStream.close();

    }
}
