/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.echoroom.classes;

import com.learning.echoroom.interfaces.IObservable;
import com.learning.echoroom.interfaces.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deivi
 */
public class Cavern implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private String phrase;

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String action) {
        observers.forEach(observer -> {
            observer.update(action);
        });
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
        notifyObservers("phrase");
    }
}
