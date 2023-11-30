import controlador.ControladorConsola;
import controlador.ControladorGUI;
import vistas.VistaCandidatoConsola;

public class App {

    public static void main(String[] args) {
        ControladorGUI controladorGUI = new ControladorGUI();
        VistaCandidatoConsola vistaCandidatoConsola = new VistaCandidatoConsola();
        ControladorConsola controladorConsola = new ControladorConsola(vistaCandidatoConsola);

        controladorGUI.iniciarVistaCandidatoGUI();
        controladorConsola.iniciar();
        
    }
}
