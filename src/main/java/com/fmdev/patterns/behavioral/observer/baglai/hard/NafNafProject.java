package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Set;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class NafNafProject implements Vacancy {

    @Override
    public boolean check(Set<String> technologies) {
        return technologies.contains("J2EE");
    }

    @Override
    public String toString() {
        return "NafNafProject{'J2EE', Senior, 7+ years}";
    }
}
