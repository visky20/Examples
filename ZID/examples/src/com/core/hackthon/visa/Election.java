package com.core.hackthon.visa;
import java.util.*;

public class Election {
	public static void main(String[] args) {
        String[] votes = { "Victor", "Veronica", "Ryan", "Dave", "Maria", "Farah", "Farah", "Ryan", "Veronica" };
        Map<String, Integer> map = new TreeMap<>();
        for (String vote : votes) {
            if (map.containsKey(vote)) {
                map.put(vote, map.get(vote) + 1);
            } else {
                map.put(vote, 1);
            }
        }
        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue())
                .getKey());
	}

}
