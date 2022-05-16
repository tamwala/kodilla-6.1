package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> number) {
        List<Integer> evenList = new ArrayList<>();

        for (Integer item : number) {
            if (item % 2 == 0) {
                evenList.add(item);
            } else {
                continue;
            }
        }
        return evenList;
    }
}








