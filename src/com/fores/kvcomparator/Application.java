package com.fores.kvcomparator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FileKeyValueComparator fileKeyValueComparator = new FileKeyValueComparator();
        String path1 = "H:\\Test\\Jar\\KeyValueComparator\\files\\PC.txt";
        String path2 = "H:\\Test\\Jar\\KeyValueComparator\\files\\小程序.txt";
        fileKeyValueComparator.compare(path1,path2,"PC","小程序");

//        List<String> lines = fileKeyValueComparator.readFile("H:\\Test\\Jar\\KeyValueComparator\\files\\PC.txt");
//        lines.stream().forEach(line->{
//            System.out.println("->"+line);
//        });

    }
}
