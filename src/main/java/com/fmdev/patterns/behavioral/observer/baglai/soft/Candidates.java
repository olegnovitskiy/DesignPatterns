package com.fmdev.patterns.behavioral.observer.baglai.soft;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Candidates {

    private List<Candidate> list = new LinkedList<Candidate>();

    // удаляем кандидата
    void removeCandidate(Candidate сandidate) {
        list.remove(сandidate);
    }

    // метод нотификации всех кандидатов списком вакансий
    void noticeAll(Vacancies vacancies) {
        for (Candidate candidate : list) {
            // заметь, тут список фильтруется
            Vacancies selected = vacancies.filter(candidate.getTechnologies());
            // и если есть что слать
            if (!selected.isEmpty()) {
                // а потом копируется И доставоляется
                candidate.haveANew(selected.getCopy());
            }
        }
    }

    // метод добавления кандидата в список
    void add(Candidate candidate) {
        list.add(candidate);
    }
    
    // метод переноса всех кандидатов в другой список кандидатов
    void moveTo(Candidates candidates) {
        candidates.list.addAll(list);
        list.clear();
    }

}
