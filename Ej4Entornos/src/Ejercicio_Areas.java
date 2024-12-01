import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_Areas {
    public static void main(String[] args) {

        //Repaso estructura de control switch.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo");

        int figura = entrada.nextInt();

        switch (figura){
            case 1:
                int lado =Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
                System.out.println("EL área del cuadrado es "+Math.pow(lado,2));
                break;

            case 2:
                int base =Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
                int altura =Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
                System.out.println("La formula del rectángulo es "+base*altura);
                break;

            default:
                System.out.println("La opción no es válida.");
        }
    }
}
}