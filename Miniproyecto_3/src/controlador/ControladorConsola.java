package controlador;

import modelos.ModeloCrud;
import vistas.VistaCandidatoConsola;

public class ControladorConsola{

    ModeloCrud modeloCrud;
    VistaCandidatoConsola vista;

    public ControladorConsola(VistaCandidatoConsola vista){
        this.vista = vista;
        this.modeloCrud = new ModeloCrud();
    } 

    public void iniciar(){
        vista.setModeloCrud(modeloCrud);
        vista.MenuPrincipal();

    }    
}
