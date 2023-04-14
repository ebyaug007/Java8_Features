package com.java.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBaseMap {


    public static List<CustomerMap> getAll() {
        return Stream.of(
                new CustomerMap(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new CustomerMap(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new CustomerMap(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new CustomerMap(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }


}
