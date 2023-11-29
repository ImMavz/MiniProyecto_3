package controlador;

import modelos.ModeloCrud;
import vistas.VistaCandidato;

public class ControladorConsola{

    ModeloCrud modeloCrud;
    VistaCandidato vista;

    public ControladorConsola(ModeloCrud modeloCrud, VistaCandidato vista){
        this.modeloCrud = modeloCrud;
        this.vista = vista;
    } 

    public void iniciar(){
        vista.MenuPrincipal();
    }

    


    
}
