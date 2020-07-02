package com.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        //store();
        load();
    }

    private static void load() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader(new File("f.txt")));
        Set<String> strings = properties.stringPropertyNames();
        for (String key:strings){
            System.out.println(key+"="+properties.getProperty(key));
        }
    }

    private static void store() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("1","bobo");
        properties.setProperty("2","alic");
        properties.setProperty("3","jgjg");
        FileWriter fileWriter = new FileWriter(new File("f.txt"));
        properties.store(fileWriter,"save date");
        fileWriter.close();
    }
}
