/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.evaluada.ian.bonilla;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class PracticaEvaluadaIanBonilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*IAN BONILLA SOLIS*/
        String Nombre;
        Nombre = JOptionPane.showInputDialog("Digita el Nombre");

        String Apellido;
        Apellido = JOptionPane.showInputDialog("Digita el Apellido");

        Double salario;
        String lectura;
        lectura = JOptionPane.showInputDialog("Digite su salario");
        salario = Double.parseDouble(lectura);
        
        Double Sem;
        Double Ivm;
        Double Aso;
        Double Tot;
        
        Sem = salario * 0.0925;
        Ivm = salario * 0.0508;
        Aso = salario * 0.025;
        Tot = salario - Sem - Ivm - Aso;

        JOptionPane.showMessageDialog(null, "Rebajo del SEM=" + Sem + "  Rebajo del IVM="
                + Ivm + "  Rebajo de la Asociancion=" + Aso);
        JOptionPane.showMessageDialog(null, Nombre + " " + Apellido + " Salario total restante =" + Tot);

    }

}
