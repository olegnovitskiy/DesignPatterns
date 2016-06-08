package com.fmdev.patterns.behavioral.observer.baglai.hard;

import java.util.Set;

public interface Resume {
	
	// в резюме есть контактные данные кандидата
	Candidate getCandidate();
	
	// и набор технологий, которыми владеет кандидат
	Set<String> getTechnologies();
	
}
