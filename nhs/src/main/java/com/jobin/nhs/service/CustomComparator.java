package com.jobin.nhs.service;

import java.util.Comparator;

import com.jobin.nhs.People;

public class CustomComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getSkillRating().compareTo(o2.getSkillRating());
    }
}
