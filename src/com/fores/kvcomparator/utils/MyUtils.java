package com.fores.kvcomparator.utils;

public class MyUtils {
    /**
     * 如果line有signs字符,就拒绝
     * @param signs
     * @param line
     * @return
     */
    public static boolean checkLine(String[] signs,String line){
        for (String str : signs) {
            if (line.contains(str)) {
                return false;
            }
        }
        if (line.isEmpty()){
            return false;
        }
        return true;
    }
}
