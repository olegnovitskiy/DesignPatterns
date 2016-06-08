package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Collection;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class EvaPupkina extends AbstractCandidate implements Candidate {

    public EvaPupkina() {
        technologies.add("J2SE");
        technologies.add("J2EE");
    }

    @Override
    public void haveANew(Collection<Vacancy> vacancies) {
        System.out.println("EvaPupkina: Nice! New vacancies:");
        for (Vacancy vacancy : vacancies) {
            System.out.println("\t" + vacancy.toString());
        }
    }

}
