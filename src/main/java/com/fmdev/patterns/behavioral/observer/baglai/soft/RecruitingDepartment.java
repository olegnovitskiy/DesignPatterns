package com.fmdev.patterns.behavioral.observer.baglai.soft;

public class RecruitingDepartment implements Recruiter {

    // рекрутеру надо как-то отличать новых кандидатов от старых
    // тут будут хранитсья новые кандидаты
    private Candidates newCandidates = new Candidates();

    // а старая база резюме кандидатов - для тех, кто хоть раз получал уведомление
    private Candidates candidates = new Candidates();

    // рекрутеру надо временно хранить свои новые вакансии
    private Vacancies newVacancies = new Vacancies();

    // но так же ему надо складировать где-то вакансии, которые уже отправлялись
    private Vacancies vacancies = new Vacancies();
    
    
    @Override
    // момент, когда кандидат обращается к рекрутеру
    public void register(Candidate candidate) {
        // рекрутер сохраняет кандидата в своем списке новых кандидатов
        newCandidates.add(candidate);
    }

    @Override
    // рекрутеру пришла новая вакансия
    public void addNew(Vacancy vacancy) {
        // и он ее добавит в свой список новых вакансий
        newVacancies.add(vacancy);            
    }

    @Override
    // метод отписки от рассылки
    public void remove(Candidate candidate) {
        // удяляем резюме кандидата из основного списка, если он там есть
        candidates.removeCandidate(candidate);
        
        // то же проделываем со списком новеньких кандидатов
        newCandidates.removeCandidate(candidate);
    }

    @Override
    // а тут пришла команда оповестить всех кандидатов
    public void notice() {
        // он достает список и уведомляет всех стареньких обо всем, 
        // что накопилось за время с прошлого оповещения  
        candidates.noticeAll(newVacancies);        
        
        // после он переносит новые вакансии в список-историю  
        newVacancies.moveTo(vacancies);
                
        // потом он уведомляет всех новеньких всеми вакансиями  
        newCandidates.noticeAll(vacancies);

        // после чего переносит резюме новеньких кандидатов в основной список
        newCandidates.moveTo(candidates);                             
    }

}
