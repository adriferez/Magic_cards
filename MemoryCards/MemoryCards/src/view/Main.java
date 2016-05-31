package view;

import java.util.Random;

import javax.swing.JOptionPane;



public class Main {
	static double nAleatorio = (Math.random() * 48) + 1;
	static int nAleatorioEntero = (int) nAleatorio;

    public static void main(String[] args) {
        JOptionPane.showInputDialog("Dime el valor de tu carta");
    
        System.out.println(nAleatorioEntero);
    } 

}
