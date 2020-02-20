package com.mohim.learn.streams;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Detail {
    private List<String> parts = new ArrayList<>(Arrays.asList("part1","part2","part3"));
}
