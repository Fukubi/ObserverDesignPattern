/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.echoroom;

import com.learning.echoroom.classes.Cavern;
import com.learning.echoroom.classes.Echo;
import java.util.Scanner;

/**
 *
 * @author Deivi
 */
public class ObserverDesignPattern {
    public static void main(String[] args) {
        Cavern cavern = new Cavern();
        cavern.add(new Echo(cavern));
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ECHO ROOM WITH OBSERVERS!!!");
        System.out.println("Entering in the cavern!");
        System.out.println("----------------------------------------------------");
        
        while(true) {
            System.out.println("Say something in the cavern");
            cavern.setPhrase(scanner.nextLine());
            System.out.println("----------------------------------------------------");
        }
        
    }
}
