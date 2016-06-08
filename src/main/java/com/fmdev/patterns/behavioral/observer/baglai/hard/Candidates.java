package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Candidates {

    private List<Resume> list = new LinkedList<Resume>(); 
    
    // так как добавляем мы кандидата по его резюме а удаляем по имени кандидата
    // то вот вам и метод
    void removeCandidate(Candidate candidate) {
        Collection<Resume> resumeForRemove = new LinkedList<Resume>(); 
        
        for (Resume resume : list) {            
            if (resume.getCandidate().equals(candidate)) {
                resumeForRemove.add(resume);
            }
        }
        
        list.removeAll(resumeForRemove);
    }
    
    // метод нотификации всех кандидатов списком вакансий
    void noticeAll(Vacancies vacancies) {
        for (Resume resume : list) {
            // заметь, тут список фильтруется
            Vacancies selected = vacancies.filter(resume.getTechnologies());
            // и если есть что слать
            if (!selected.isEmpty()) {
                // а потом копируется И доставоляется
                resume.getCandidate().haveANew(selected.getCopy());
            }
        }
    }

    // метод добавления резюме кандидата в список
    void add(Resume resume) {
        list.add(resume);        
    }
    
    // метод переноса всех резюме в другой список кандидатов
    void moveTo(Candidates candidates) {
        candidates.list.addAll(list);
        list.clear();
    }

}
