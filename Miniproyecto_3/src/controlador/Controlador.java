package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelos.ModeloCrud;
import vistas.VistaCandidato;
import vistas.VistaCandidatoGanadorGUI;
import vistas.VistaCiudadesCandidatoGUI;
import vistas.VistaListaCandidatoGUI;
import vistas.VistaVotosCandidatosGUI;
import vistas.VistasPartidosCandidatoGUI;

public class Controlador implements ActionListener{

    ModeloCrud modeloCrud;
    VistaCandidato vista;

    public Controlador(ModeloCrud modeloCrud, VistaCandidato vista){
        this.modeloCrud = modeloCrud;
        this.vista = vista;

        

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
