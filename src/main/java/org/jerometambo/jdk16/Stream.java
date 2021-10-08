package org.jerometambo.jdk16;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    
    public static void main(String... args) {
        List<Integer> collect = List.of(1, 2, 3).stream()
                .filter(i -> i < 3)
                .collect(Collectors.toList());
    
        List<Integer> toList = List.of(1, 2, 3).stream()
                .filter(i -> i < 3)
                .toList();
        
        collect.add(5);
    
        toList.add(5);
    }
    
}
