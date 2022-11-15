/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.chain.of.responability;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author Erick
 */
public class ChainOfResponability {

    public static void main(String[] args) {
        String[] carreras = {
            "Suma",
            "Resta",
            "Multiplicacion",
            "Dividir"
        };
        
        ImageIcon icon = new ImageIcon();
        String resp = (String) JOptionPane.showInputDialog(null,
                "Seleccione una operacion", "Operaciones",
                JOptionPane.DEFAULT_OPTION, icon,
                carreras, carreras[0]);
        JOptionPane.showMessageDialog(null, "escogiste la operacion " + resp);
        String respuesta1 = JOptionPane.showInputDialog("ingrese el primer digito");
        String respuesta2 = JOptionPane.showInputDialog("Escribe el segundo digito");
        int number1 = Integer.parseInt(respuesta1);
        int number2 = Integer.parseInt(respuesta2);
        ramdom();
        
         

    }
    public static void Manejador() {
        
        
    }
     public static void ManejadorConcreto1() {
        
        
    }
    public static void ManejadorConcreto2() {
        
        
    }
    public static void ManejadorConcreto3() {
        
        
    }
    
    public static void ramdom() {
        Random r1 = new Random(10);
         int valorDado = r1.nextInt(10)+1;
        System.out.println(valorDado);
        
        
        
    }
}


