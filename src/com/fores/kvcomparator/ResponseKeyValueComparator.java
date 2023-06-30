package com.fores.kvcomparator;

import com.fores.kvcomparator.utils.MyUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseKeyValueComparator implements KeyValueComparator{
    /**
     * 读取文件
     * @param path 文件路径
     * @return
     */
    public List<String> readFile(String path) {
        BufferedReader reader = null;
        List<String> result = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                    if(MyUtils.checkLine(new String[]{"{","}","[","]"},line)){
                        result.add(line);
                    }
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return result;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void compare(String path1, String path2, String id1, String id2) {
        List<String> lines1 = readFile(path1);
        List<String> lines2 = readFile(path2);
        Map<String, String> map1 = new HashMap<>();
        List<String> keys1 = new ArrayList<>();
        List<String> keys2 = new ArrayList<>();

        lines1.stream().forEach(line->{
            String[] split = line.split(":");
            String key = split[0].trim();

            keys1.add(key);
            String value = "";
            if (split.length>1){    //java对于"AgentContractSignDate:"只会产生一个元素的数组,和JS不同
                value = split[1].trim().replaceAll("^\"|\"$", "");
            }
            map1.put(key, value);

        });
        System.out.println("map1=="+map1);
    }
}
