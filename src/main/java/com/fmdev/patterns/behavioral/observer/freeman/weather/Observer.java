package com.fmdev.patterns.behavioral.observer.freeman.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
