package com.java.features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {


    public static List<EmployeeMapReduce> getEmployees(){
      return  Stream.of(new EmployeeMapReduce(101,"john","A",60000),
              new EmployeeMapReduce(109,"peter","B",30000),
              new EmployeeMapReduce(102,"mak","A",80000),
              new EmployeeMapReduce(103,"kim","A",90000),
              new EmployeeMapReduce(104,"json","C",15000))
              .collect(Collectors.toList());
    }
}
