package com.mohim.learn;

import com.mohim.learn.streams.Detail;
import com.mohim.learn.streams.impl.VehicleImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class StreamsApplication  {

    public static void main(String[] args) {
        SpringApplication.run(StreamsApplication.class, args);
        System.out.println("Streams");

        VehicleImp vehicleImp = new VehicleImp();
        System.out.println(vehicleImp.getOverview());

        String[] arr = new String[]{"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a","b","c");


        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.parallelStream().forEach(System.out::println);

        long count = list.stream().distinct().count();

        System.out.println("Count distinct : " + count);

        for (String string: list){
            if(string.contains("a")){
                System.out.println("Found 'a' via for each loop");
            }
        }

        boolean isExist = list.stream().anyMatch(element -> element.equals("a"));
        if (isExist){
            System.out.println("Found 'a' using stream anyMatch");
        }


        System.out.println("FILTERING");
        ArrayList<String> filteringList = new ArrayList<>();
        filteringList.add("Onea");
        filteringList.add("OneAndOnlya");
        filteringList.add("Dereka");
        filteringList.add("Changea");
        filteringList.add("factorya");
        filteringList.add("justBeforea");
        filteringList.add("Italya");
        filteringList.add("Italya");
        filteringList.add("Thursdaya");
        filteringList.add("");
        filteringList.add("");

        Stream<String> filteredListStream = filteringList.stream().filter(element -> element.contains("d"));


        System.out.println("STREAMS MAPPING");

        List<String> uris = new ArrayList<>();
        uris.add("/temp/a.txt");
        Stream<Path> uriStream = uris.stream().map(uri -> Paths.get(uri));



        System.out.println("STREAMS FLAT MAPPING");

        List<Detail> details = new ArrayList<>();
        details.add(new Detail());
        details.add(new Detail());
        Stream<String> detailStream = details.stream().flatMap(detail -> detail.getParts().stream());



        System.out.println("STREAMS MORE MATCHING");
        boolean isValid = filteringList.stream().anyMatch(element -> element.contains("a"));
        boolean isValidTwo = filteringList.stream().allMatch(element -> element.contains("a"));
        boolean isValidThree = filteringList.stream().noneMatch(element -> element.contains("noob"));


        System.out.println("STREAMS REDUCTION");

        List<Integer> integers = Arrays.asList(1,1,1);

        Integer reduced = integers.stream().reduce(23,(a, b) -> a + b);


        System.out.println("STREAMS COLLECTING");

        List<String> resultList = filteringList.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());


        System.out.println("Finished");


    }


}
