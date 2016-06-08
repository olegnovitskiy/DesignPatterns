package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Set;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class NifNifProject implements Vacancy {

    @Override
    public boolean check(Set<String> technologies) {
        return technologies.contains("J2SE") &&
                technologies.contains("Android");
    }

    @Override
    public String toString() {
        return "Project{'J2SE', 'Android', Middle, 2+ years}";
    }
}
