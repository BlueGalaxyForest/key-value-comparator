package com.fores.kvcomparator.kv;

import com.fores.kvcomparator.kv.IKeyValueComparator;
import lombok.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
/**
 * 比较响应数据的键值对
 */
public class FileKeyValueComparator implements IKeyValueComparator {
    private String id;
    private String path;

    public List<String> readFile(String path) {
        BufferedReader reader = null;
        List<String> result = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty() && !line.contains("//")) {  // 跳过空行和单行注释
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

    /**
     * 通过路径指针的文件比较
     * @param path1 路径1
     * @param path2 路径2
     * @param id1 标识1
     * @param id2 标识2
     */
    @Override
    public void compare(String path1, String path2, String id1, String id2) {
        List<String> lines1 = readFile(path1);
        List<String> lines2 = readFile(path2);
        Map<String, String> map1 = new HashMap<>();
        List<String> keys1 = new ArrayList<>();
        List<String> keys2 = new ArrayList<>();

        lines1.stream().forEach(line -> {
            String[] split = line.split(":");
            String key = split[0].trim();

            keys1.add(key);
            String value = "";
            if (split.length>1){    //java对于"AgentContractSignDate:"只会产生一个元素的数组,和JS不同
                value = split[1].trim().replaceAll("^\"|\"$", "");
            }
            map1.put(key, value);
        });

        lines2.stream().forEach(line -> {
            String[] split = line.split(":");
            String key = split[0].trim();
            keys2.add(key);
            String value = "";
            if (split.length>1){    //java对于"AgentContractSignDate:"只会产生一个元素的数组,和JS不同
                value = split[1].trim().replaceAll("^\"|\"$", "");
            }


            String v1 = map1.get(key);
            if (v1 != null) {
                if (!v1.equals(value)) {
                    System.err.println(id1 + " 的 " + key + ":" + v1 + " [VS] " + id2 + " 的 " + key + ":" + value);
                }
            }
        });

        List<String> collect1 = keys1.stream().filter(key -> !keys2.contains(key)).collect(Collectors.toList());
        System.out.println("<<"+id1+">>" + " 比 " + "<<"+id2+">>" + "多出来的字段:" + collect1);

        List<String> collect2 = keys2.stream().filter(key -> !keys1.contains(key)).collect(Collectors.toList());
        System.out.println("<<"+id2+">>" + " 比 " + "<<"+id1+">>" + "多出来的字段:" + collect2);

    }
}
