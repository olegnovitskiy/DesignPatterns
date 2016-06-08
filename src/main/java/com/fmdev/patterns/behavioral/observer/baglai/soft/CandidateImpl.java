package com.fmdev.patterns.behavioral.observer.baglai.soft;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class CandidateImpl implements Candidate {

    protected Set<String> technologies = new HashSet<String>();
    private String name;

    public CandidateImpl(String name, String...technologies) {
        this.name = name;
        this.technologies.addAll(Arrays.asList(technologies));
    }

    @Override
    public void haveANew(Collection<Vacancy> vacancies) {
        System.out.println(name);
        for (Vacancy vacancy : vacancies) {
            System.out.println("\t" + vacancy.toString());
        }
    }

    @Override
    public Set<String> getTechnologies() {
        return technologies;
    }
}
