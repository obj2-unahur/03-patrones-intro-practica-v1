package ar.edu.unahur.obj2.figuras;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        String radioInput = JOptionPane.showInputDialog("Ingrese el radio del circulo 1");
        Integer radio1 = Integer.parseInt(radioInput);
        Circulo circulo1 = new Circulo("rojo", radio1);
        JOptionPane.showMessageDialog(null, "Superficie: " + circulo1.area(),"Superficie",JOptionPane.INFORMATION_MESSAGE);


        System.out.println();
    }
}
