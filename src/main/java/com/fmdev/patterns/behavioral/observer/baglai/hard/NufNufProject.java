package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Set;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class NufNufProject implements Vacancy {

    @Override
    public boolean check(Set<String> technologies) {
        return technologies.contains("J2SE");
    }

    @Override
    public String toString() {
        return "NufNufProject{'J2SE', trainee}";
    }
}
