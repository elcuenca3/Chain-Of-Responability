
package com.mycompany.chain.of.responability;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

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
        int h=0;

        int c = 1;
        while (c <= 1) {
            int ra = ramdom();
            if(h!=ra){
                            boolean de = ramdom2();
            System.out.println(ra);
            System.out.println(de);
            
            switch (ra) {
                case 1:
                    if (de) {
                        int oper = ManejadorConcreto1(number1, number2, resp);
                        JOptionPane.showMessageDialog(null, "M1: La Operacion fue realizada con exito " + oper);
                        c++;

                    } else {
                        System.out.println("el proceso cambio de manejador");
                    }

                    break;
                case 2:
                    if (de) {
                        int oper = ManejadorConcreto2(number1, number2, resp);
                        JOptionPane.showMessageDialog(null, "M2: La Operacion fue realizada con exito " + oper);
                        c++;

                    } else {
                       JOptionPane.showMessageDialog(null, "el proceso cambio de manejador");
                    }

                    break;
                case 3:
                    if (de) {
                        int oper = ManejadorConcreto3(number1, number2, resp);
                        JOptionPane.showMessageDialog(null, "M3: La Operacion fue realizada con exito " + oper);
                        c++;

                    } else {
                        JOptionPane.showMessageDialog(null,"el proceso cambio de manejador");
                    }

                    break;
                default:
            }
                
            }
            h=ra;

        }
    }

    public static int ManejadorConcreto1(int x, int y, String fun) {
        int operaciom = 0;

        if (fun == "Suma") {
            operaciom = x + y;
        }
        if (fun == "Resta") {
            operaciom = x - y;

        }
        if (fun == "Multiplicacion") {
            operaciom = x * y;
        }
        if (fun == "Dividir") {
            operaciom = x / y;
        }

        return operaciom;
    }

    public static int ManejadorConcreto2(int x, int y, String fun) {
        int operaciom = 0;

        if (fun == "Suma") {
            operaciom = x + y;
        }
        if (fun == "Resta") {
            operaciom = x - y;

        }
        if (fun == "Multiplicacion") {
            operaciom = x * y;
        }
        if (fun == "Dividir") {
            operaciom = x / y;
        }

        return operaciom;
    }

    public static int ManejadorConcreto3(int x, int y, String fun) {
        int operaciom = 0;

        if (fun == "Suma") {
            operaciom = x + y;
        }
        if (fun == "Resta") {
            operaciom = x - y;

        }
        if (fun == "Multiplicacion") {
            operaciom = x * y;
        }
        if (fun == "Dividir") {
            operaciom = x / y;
        }

        return operaciom;
    }

    public static int ramdom() {
        Random r1 = new Random();
        int valorDado = r1.nextInt(3) + 1; 
        return valorDado;
    }

    public static boolean ramdom2() {
        Random r1 = new Random();
        boolean moa = r1.nextBoolean();
        return moa;
    }
}
