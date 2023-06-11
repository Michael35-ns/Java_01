/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject4;

import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class Tarea_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x=0;
    int estudiantes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes"));
    int promedio = 0;
    int notas = 0;
 
    while(estudiantes != x )
    {
        notas = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del estudiante"));
        x+=1;
       
       
    }
    System.out.print(notas);
 
    
}
}

