package com.fmdev.patterns.behavioral.observer.baglai.soft;

public interface Recruiter {
    
    // через этот метод соискатель может подписаться на рассылку
	// регистрация кандината лично
	void register(Candidate candidate);

    // кто-то может через этот метод направить рекрутеру новую вакансию
    void addNew(Vacancy vacancy);

    // кандидат может отказаться от услуг рекрутера
    void remove(Candidate candidate);

    // с помощью этого метода рекрутеру подается команда 
    // оповестить всех кандидатов
	void notice();
    
}
