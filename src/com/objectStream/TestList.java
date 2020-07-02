package com.objectStream;

import java.io.*;
import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("lisdj",23));
        list.add(new Person("王五",93));
        list.add(new Person("jfjdl",22));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("list.txt"));
        objectOutputStream.writeObject(list);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("list.txt"));
        Object o = objectInputStream.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>)o;
        for (Person person:list2){
            System.out.println(person);
        }
        objectInputStream.close();
        objectOutputStream.close();
    }
}
