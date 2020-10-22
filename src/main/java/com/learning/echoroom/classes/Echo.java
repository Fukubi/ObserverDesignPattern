/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.echoroom.classes;

import com.learning.echoroom.interfaces.IObserver;

/**
 *
 * @author Deivi
 */
public class Echo implements IObserver {
    private Cavern cavern;

    public Echo(Cavern cavern) {
        this.cavern = cavern;
    }

    @Override
    public void update(String action) {
        System.out.println("ECHO: " + cavern.getPhrase());
    }
    
}
