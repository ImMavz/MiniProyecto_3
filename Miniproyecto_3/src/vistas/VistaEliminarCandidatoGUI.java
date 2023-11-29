package vistas;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import modelos.CandidatoModelo;
import modelos.ModeloCrud;

public class VistaEliminarCandidatoGUI extends JFrame {
    Container contenedor;
    FlowLayout layout;
    JLabel eliminarJLabel;
    JTextField eliminarText;
    JButton guardar, eliminar;
    static ArrayList<CandidatoModelo> listaCandidato;
   
    public VistaEliminarCandidatoGUI(){

        setTitle("Eliminar Candidato");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        contenedor = getContentPane();
        layout = new FlowLayout();
        contenedor.setLayout(layout);

        eliminarJLabel = new JLabel("Ingrese la cedula del candidato que desea eliminar: ");
        eliminarText = new JTextField(10);
        contenedor.add(eliminarJLabel);
        contenedor.add(eliminarText);

        eliminar = new JButton("Eliminar");
        contenedor.add(eliminar);

        eliminar.addActionListener(e -> {
            String cedulaAEliminar = eliminarText.getText();
            //Si no hay nada introducido sale el error
            if (cedulaAEliminar.isEmpty() ) {
                JOptionPane.showMessageDialog(this, "¿Como vas a eliminar nada?\n Introduce algo por favor.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Valida que la cédula solo contenga números pues es imposible que tenga letras
            if (!cedulaAEliminar.matches("^[0-9]+$")) {
                JOptionPane.showMessageDialog(this, "Que cedula mas rara que contiene letras \n ¿si será colombiana?", "Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            ModeloCrud.EliminarCandidatoGUI(cedulaAEliminar);
            JOptionPane.showMessageDialog(this, "Candidato eliminado correctamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            eliminarText.setText("");
        });
    }    
}
