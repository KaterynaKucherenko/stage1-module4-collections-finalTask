package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        Set<String> temp = new HashSet<>();

       // for (Map.Entry<String, Integer> e : sourceMap.entrySet()){
            for (String key: sourceMap.keySet()){
                if (!result.containsKey(key.length())){
                result.put(key.length(), new HashSet<>());
                temp = result.get(key.length());
                temp.add(key);
                result.put(key.length(), temp);}
                else {
                    temp = result.get(key.length());
                    temp.add(key);
                    result.put(key.length(), temp);}




}
        return result; }}
