/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pilha;

import java.util.Random;

/**
 *
 * @author Mauricio
 */
public class TesteFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila p = new Fila();
        int max = 10, r, n;
        Random random = new Random();

        try {
            for (int i = 0; i < max; i++) {
                r = Math.abs(random.nextInt() % max);
                p.push(r, i);
                //System.out.println("Empilhou: " + r);
            }
            p.imprimir();
            p.pop();
            System.out.println("---------------------------------");
            p.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
