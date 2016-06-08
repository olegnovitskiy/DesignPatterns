package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Vacancies {
    
    private List<Vacancy> list = new LinkedList<Vacancy>();

    // метод добавления вакансии в список
    void add(Vacancy vacancy) {
        list.add(vacancy);        
    }

    // а это новый метод копирования списка вакансий    
    Collection<Vacancy> getCopy() {
        return new LinkedList<Vacancy>(list);
    }

    // метод перемещения вакансий в другой список
    void moveTo(Vacancies vacancies) {
        vacancies.list.addAll(list);                
        list.clear();        
    }

    // метод фильтрации списка вакансий по категориям
    Vacancies filter(Set<String> technologies) {
        Vacancies result = new Vacancies();
        
        for (Vacancy vacancy : list) {
            if (vacancy.check(technologies)) {
                result.add(vacancy);                
            }
        }
        
        return result;
    }

    // а есть у нас вообще что-то?
    boolean isEmpty() {
        return list.isEmpty();
    }
    
}
