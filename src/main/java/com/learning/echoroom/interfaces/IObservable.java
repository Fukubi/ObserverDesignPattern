/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.echoroom.interfaces;

/**
 *
 * @author Deivi
 */
public interface IObservable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObservers(String action);
}
