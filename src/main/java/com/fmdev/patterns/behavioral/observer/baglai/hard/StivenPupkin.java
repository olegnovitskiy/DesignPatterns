package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Collection;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class StivenPupkin extends AbstractCandidate implements Candidate {

    public StivenPupkin() {
        technologies.add("J2SE");
        technologies.add("Android");
    }

    @Override
    public void haveANew(Collection<Vacancy> vacancies) {
        System.out.println("StivenPupkin: Nice! New vacancies:");
        for (Vacancy vacancy : vacancies) {
            System.out.println("\t" + vacancy.toString());
        }
    }
}
