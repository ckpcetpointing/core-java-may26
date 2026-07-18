package com.jsn.core.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamDemo1 {


    public static void main(String[] args) {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        List<String> holidayDays = List.of("Saturday","Sunday","Wednesday");

        List<String> workingDaysList = weekDays.stream()
                                                                                .filter(day -> !holidayDays.contains(day)) //Intermediate operation which is lazy
                                                                                .collect(Collectors.toList());
        System.out.println(workingDaysList);

        int[] nums = {1,2,3,5,7,4,8,5,12,67,45,24};

        OptionalInt sumOfAllEvenNumber = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum);

        System.out.println("Sum Of all Even Number : "+sumOfAllEvenNumber.getAsInt());


    }

}
