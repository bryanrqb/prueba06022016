package prueba1;

import javax.swing.JOptionPane;

public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Clase principal, iniciadora o programa principal
        String mate;
        String fisica;
        String quimica;
        String progra;
        String nombre;
        
        double n1, n2, n3, n4, promedio;
        
        JOptionPane.showMessageDialog(null, "Cálculo del Promedio Final");
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del alumno");
        mate=JOptionPane.showInputDialog("Ingrese el promedio de mate");
        fisica=JOptionPane.showInputDialog("Ingrese el promedio de fisica");
        quimica=JOptionPane.showInputDialog("Ingrese el promedio de quimica");
        progra=JOptionPane.showInputDialog("Ingrese el promedio de progra");
        n1=Integer.parseInt(mate);
        n2=Integer.parseInt(fisica);
        n3=Integer.parseInt(quimica);
        n4=Integer.parseInt(progra);
        promedio=(n1+n2+n3+n4)/4;
        JOptionPane.showMessageDialog(null, "El promedio de "+nombre+" es: "+promedio);
    }
}
