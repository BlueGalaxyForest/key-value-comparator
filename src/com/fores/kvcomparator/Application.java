package com.fores.kvcomparator;

import com.fores.kvcomparator.kv.FileKeyValueComparator;

public class Application {
    public static void main(String[] args) {
        FileKeyValueComparator fileKeyValueComparator = new FileKeyValueComparator();

        String path1 = "C:\\Users\\Administrator\\Desktop\\GitHub项目\\key-value-comparator\\files\\PC.txt";
        String path2 = "C:\\Users\\Administrator\\Desktop\\GitHub项目\\key-value-comparator\\files\\小程序.txt";
        fileKeyValueComparator.compare(path1,path2,"PC的直接提交","小程序的直接提交");
//        responseKeyValueComparator.compare(path1,path2,"58459案件","176699案件");

    }
}
